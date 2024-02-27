package org.agregiosolution.greenpowertrade.application;


import org.agregiosolution.greenpowertrade.domaine.InconsistentContributionException;
import org.agregiosolution.greenpowertrade.domaine.OfferRepository;
import org.agregiosolution.greenpowertrade.domaine.OfferService;
import org.agregiosolution.greenpowertrade.domaine.entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class OfferServiceTest {

    OfferService offerService;

    @Mock
    OfferRepository offerRepository;

    @BeforeEach
    void setUp() {

        offerService = new OfferServiceImpl(offerRepository);
    }

    @ParameterizedTest()
    @MethodSource("provideValidProducersAndBlocksEnergy")
    public void shouldCreateOfferWhenTotalProducerContributionIsEqualToTotalBlockQuantity(Set<TimeBlock> timeBlocks) {
        Offer offer = buildOffer(timeBlocks);
        assertDoesNotThrow(() -> offerService.createOffer(offer));
        verify(offerRepository).save(offer);

    }

    @ParameterizedTest()
    @MethodSource("provideInValidProducersAndBlocksEnergy")
    public void shouldThrowExceptionWhenTotalProducerContributionIsNotEqualToTotalBlockQuantity(Set<TimeBlock> timeBlocks) {
        Offer offer = buildOffer(timeBlocks);
        assertThrows(InconsistentContributionException.class, () -> offerService.createOffer(offer));
        verify(offerRepository, never()).save(offer);

    }

    private static Stream<Arguments> provideValidProducersAndBlocksEnergy() {
        return provideProducersAndBlocksEnergy(10, 10);
    }

    private static Stream<Arguments> provideInValidProducersAndBlocksEnergy() {
        return provideProducersAndBlocksEnergy(5, 10);
    }

    private static Stream<Arguments> provideProducersAndBlocksEnergy(double quantityMW1, double quantityMW2) {
        EnergyProducer prod1 = createEnergyProducer(EnergyProducer.EnergyType.EOLIEN, "prod1", 1l);
        EnergyProducer prod2 = createEnergyProducer(EnergyProducer.EnergyType.EOLIEN, "prod2", 2l);
        EnergyProducer prod3 = createEnergyProducer(EnergyProducer.EnergyType.SOLAIRE, "prod3", 3l);

        ProducerContribution producerContribution1 = createProducerContribution(5, prod1);
        ProducerContribution producerContribution2 = createProducerContribution(5, prod2);
        ProducerContribution producerContribution3 = createProducerContribution(10, prod3);

        TimeBlock timeBlock1 = createTimeBlock(quantityMW1, Set.of(producerContribution1, producerContribution2), 1l);
        TimeBlock timeBlock2 = createTimeBlock(quantityMW2, Set.of(producerContribution3), 2l);

        return Stream.of(
                Arguments.of(Set.of(timeBlock1)),
                Arguments.of(Set.of(timeBlock1, timeBlock2))
        );
    }


    private static Offer buildOffer(Set<TimeBlock> timeBlocks) {
        Market market = new Market(1l, Market.MarketType.RESERVE_PRIMAIRE);
        return new Offer(1l, market, timeBlocks);
    }

    private static EnergyProducer createEnergyProducer(EnergyProducer.EnergyType type, String name, Long id) {
        return new EnergyProducer(id, type, name);
    }

    private static ProducerContribution createProducerContribution(double mwContributed, EnergyProducer producer) {
        return new ProducerContribution(producer, mwContributed);
    }

    private static TimeBlock createTimeBlock(double quantityMW, Set<ProducerContribution> producers, Long id) {
        return new TimeBlock(id, quantityMW, 20, producers);
    }
}
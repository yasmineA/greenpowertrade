package org.agregiosolution.greenpowertrade.application.services;

import org.agregiosolution.greenpowertrade.domain.entities.Market;
import org.agregiosolution.greenpowertrade.domain.entities.Offer;
import org.agregiosolution.greenpowertrade.domain.entities.ProducerContribution;
import org.agregiosolution.greenpowertrade.domain.exceptions.InconsistentContributionException;
import org.agregiosolution.greenpowertrade.domain.repositories.OfferRepository;
import org.agregiosolution.greenpowertrade.domain.services.OfferService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }


    @Override
    public void createOffer(Offer offer) {
        if (!isValidContribution(offer)) {
            throw new InconsistentContributionException();
        }
        offerRepository.save(offer);
    }

    @Override
    public Map<Market, List<Offer>> getOffers() {
        Set<Offer> offers = offerRepository.getOffers();
        //todo replace with custom jpa query
        return offers.stream()
                .collect(Collectors.groupingBy(Offer::getMarket));
    }

    private boolean isValidContribution(Offer offer) {
        return offer.getTimeBlocks()
                .stream()
                .allMatch(timeBlock -> timeBlock.getContributions()
                        .stream()
                        .mapToDouble(ProducerContribution::getMwContributed).sum() == timeBlock.getQuantityMW());

    }
}

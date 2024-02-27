package org.agregiosolution.greenpowertrade.infrastructure;


import org.agregiosolution.greenpowertrade.domaine.entities.EnergyProducer;
import org.agregiosolution.greenpowertrade.domaine.entities.Market;
import org.agregiosolution.greenpowertrade.domaine.entities.Offer;
import org.agregiosolution.greenpowertrade.infrastructure.entities.EnergyProducerEntity;
import org.agregiosolution.greenpowertrade.infrastructure.entities.MarketEntity;
import org.agregiosolution.greenpowertrade.infrastructure.entities.OfferEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OfferMapper {
    OfferEntity mapToOfferEntity(Offer offer);


    Offer mapToOffer(OfferEntity offer);

    @Mapping(target = "type", expression = "java(market.getType().name())")
    MarketEntity mapToMarketEntity(Market market);

    @Mapping(target = "type", expression = "java(producer.getType().name())")
    EnergyProducerEntity mapToEnergyProducerEntity(EnergyProducer producer);

    @InheritInverseConfiguration(name = "mapToMarketEntity")
    Market mapToMarket(MarketEntity market);

}


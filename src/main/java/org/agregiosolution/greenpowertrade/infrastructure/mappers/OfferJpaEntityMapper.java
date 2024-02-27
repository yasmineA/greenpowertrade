package org.agregiosolution.greenpowertrade.infrastructure.mappers;


import org.agregiosolution.greenpowertrade.domain.entities.Offer;
import org.agregiosolution.greenpowertrade.infrastructure.entities.OfferEntity;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface OfferJpaEntityMapper {

    OfferEntity mapToOfferEntity(Offer offer);

    Offer mapToOffer(OfferEntity offer);


    Set<Offer> mapToOffers(List<OfferEntity> offers);
}


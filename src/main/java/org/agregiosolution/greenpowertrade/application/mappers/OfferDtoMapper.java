package org.agregiosolution.greenpowertrade.application.mappers;


import org.agregiosolution.greenpowertrade.application.dto.OfferDto;
import org.agregiosolution.greenpowertrade.domain.entities.Offer;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface OfferDtoMapper {
    Set<OfferDto> mapToOffersDto(Set<Offer> offers);

    Offer mapToOffer(OfferDto offer);
}

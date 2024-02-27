package org.agregiosolution.greenpowertrade.application;


import org.agregiosolution.greenpowertrade.application.dto.OfferDto;
import org.agregiosolution.greenpowertrade.domaine.entities.Offer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OfferMapperDto {
    OfferDto mapToOfferDto(Offer offer);

    Offer mapToOffer(OfferDto offer);
}

package org.agregiosolution.greenpowertrade.application.api;

import org.agregiosolution.greenpowertrade.application.OfferMapperDto;
import org.agregiosolution.greenpowertrade.application.dto.OfferDto;
import org.agregiosolution.greenpowertrade.domaine.OfferService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/offer")
public class OfferController {
    OfferService OfferService;
    OfferMapperDto offerMapper;

    public OfferController(OfferService OfferService, OfferMapperDto offerMapper) {
        this.OfferService = OfferService;
        this.offerMapper = offerMapper;
    }

    @PostMapping
    public ResponseEntity<Void> createOffer(OfferDto offer) {
        OfferService.createOffer(offerMapper.mapToOffer(offer));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<String> getOffers() {
        return null;
    }

}

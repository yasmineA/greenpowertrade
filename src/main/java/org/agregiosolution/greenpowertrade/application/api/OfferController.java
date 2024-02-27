package org.agregiosolution.greenpowertrade.application.api;

import lombok.AllArgsConstructor;
import org.agregiosolution.greenpowertrade.application.dto.OfferDto;
import org.agregiosolution.greenpowertrade.application.mappers.OfferDtoMapper;
import org.agregiosolution.greenpowertrade.domain.entities.Market;
import org.agregiosolution.greenpowertrade.domain.entities.Offer;
import org.agregiosolution.greenpowertrade.domain.services.OfferService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/offer")
public class OfferController {

    private final OfferService offerService;
    private final OfferDtoMapper offerMapper;

    @PostMapping
    public ResponseEntity<Void> createOffer(@RequestBody OfferDto offer) {
        offerService.createOffer(offerMapper.mapToOffer(offer));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<Map<Market, List<Offer>>> getOffers() {
        return ResponseEntity.status(HttpStatus.OK).body(offerService.getOffers());
    }

}

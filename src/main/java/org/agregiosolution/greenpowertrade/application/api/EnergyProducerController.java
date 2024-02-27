package org.agregiosolution.greenpowertrade.application.api;

import org.agregiosolution.greenpowertrade.application.dto.EnergyProducerDto;
import org.agregiosolution.greenpowertrade.application.dto.MarketDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parc")
public class EnergyProducerController {

    @PostMapping
    public ResponseEntity<String> createProducer(EnergyProducerDto producer) {

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/market/{market}")
    public ResponseEntity<String> getProducersByMarket(@PathVariable MarketDto market) {
        return null;
    }
}
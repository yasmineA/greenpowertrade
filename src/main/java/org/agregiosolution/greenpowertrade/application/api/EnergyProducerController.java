package org.agregiosolution.greenpowertrade.application.api;

import lombok.AllArgsConstructor;
import org.agregiosolution.greenpowertrade.application.dto.EnergyProducerDto;
import org.agregiosolution.greenpowertrade.application.mappers.ProducerDtoMapper;
import org.agregiosolution.greenpowertrade.domain.entities.Market;
import org.agregiosolution.greenpowertrade.domain.repositories.ProducerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parc")
@AllArgsConstructor
public class EnergyProducerController {

    private final ProducerRepository producerRepository;
    private final ProducerDtoMapper producerDtoMapper;

    @PostMapping
    public ResponseEntity<Void> createProducer(@RequestBody EnergyProducerDto producer) {
        producerRepository.save(producerDtoMapper.toEnergyProducer(producer));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/market/{market}")
    public ResponseEntity<List<EnergyProducerDto>> getProducersByMarket(@PathVariable Market.MarketType market) {
        return ResponseEntity.status(HttpStatus.OK).body(producerDtoMapper.mapToProducersDto(producerRepository.getProducersByMarket(market)));
    }
}
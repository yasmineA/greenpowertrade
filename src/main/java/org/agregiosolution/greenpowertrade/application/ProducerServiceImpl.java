package org.agregiosolution.greenpowertrade.application;

import org.agregiosolution.greenpowertrade.domaine.ProducerRepository;
import org.agregiosolution.greenpowertrade.domaine.ProducerService;
import org.agregiosolution.greenpowertrade.domaine.entities.Offer;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {

    private final ProducerRepository producerRepository;

    public ProducerServiceImpl(ProducerRepository producerRepository) {
        this.producerRepository = producerRepository;
    }


    @Override
    public void createProducer(Offer offer) {

    }
}

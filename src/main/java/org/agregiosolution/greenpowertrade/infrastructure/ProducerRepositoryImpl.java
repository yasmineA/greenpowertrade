package org.agregiosolution.greenpowertrade.infrastructure;

import org.agregiosolution.greenpowertrade.domaine.ProducerRepository;
import org.agregiosolution.greenpowertrade.domaine.entities.EnergyProducer;
import org.springframework.stereotype.Repository;

@Repository
public class ProducerRepositoryImpl implements ProducerRepository {
    ProducerRepositoryJpa producerRepositoryJpa;
    OfferMapper offerMapper;

    public ProducerRepositoryImpl(ProducerRepositoryJpa offerRepository, OfferMapper offerMapper) {
        this.producerRepositoryJpa = offerRepository;
        this.offerMapper = offerMapper;
    }

    @Override
    public EnergyProducer save(EnergyProducer producer) {
        return producerRepositoryJpa.save(offerMapper.mapToEnergyProducerEntity(producer))
    }
}

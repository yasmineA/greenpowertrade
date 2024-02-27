package org.agregiosolution.greenpowertrade.infrastructure.repositories;

import org.agregiosolution.greenpowertrade.domain.entities.EnergyProducer;
import org.agregiosolution.greenpowertrade.domain.repositories.ProducerRepository;
import org.agregiosolution.greenpowertrade.infrastructure.mappers.ProducerJpaEntityMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ProducerRepositoryImpl implements ProducerRepository {

    ProducerRepositoryJpa producerRepositoryJpa;
    ProducerJpaEntityMapper producerJpaEntityMapper;

    public ProducerRepositoryImpl(ProducerRepositoryJpa producerRepository, ProducerJpaEntityMapper producerJpaEntityMapper) {
        this.producerRepositoryJpa = producerRepository;
        this.producerJpaEntityMapper = producerJpaEntityMapper;
    }

    @Override
    public EnergyProducer save(EnergyProducer producer) {
        return producerJpaEntityMapper.mapToProducer(producerRepositoryJpa.save(producerJpaEntityMapper.mapToProducerJpaEntity(producer)));
    }
}

package org.agregiosolution.greenpowertrade.infrastructure.repositories;

import org.agregiosolution.greenpowertrade.domain.entities.EnergyProducer;
import org.agregiosolution.greenpowertrade.domain.entities.Market;
import org.agregiosolution.greenpowertrade.domain.repositories.ProducerRepository;
import org.agregiosolution.greenpowertrade.infrastructure.mappers.ProducerJpaEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProducerRepositoryImpl implements ProducerRepository {

    ProducerRepositoryJpa producerRepositoryJpa;
    ProducerJpaEntityMapper mapper;

    public ProducerRepositoryImpl(ProducerRepositoryJpa producerRepository, ProducerJpaEntityMapper producerJpaEntityMapper) {
        this.producerRepositoryJpa = producerRepository;
        this.mapper = producerJpaEntityMapper;
    }

    @Override
    public EnergyProducer save(EnergyProducer producer) {
        return mapper.mapToProducer(producerRepositoryJpa.save(mapper.mapToProducerJpaEntity(producer)));
    }

    @Override
    public List<EnergyProducer> getProducersByMarket(Market.MarketType market) {
        return mapper.mapToProducers(producerRepositoryJpa.findProducersByMarket(market));
    }
}

package org.agregiosolution.greenpowertrade.domain.repositories;

import org.agregiosolution.greenpowertrade.domain.entities.EnergyProducer;

public interface ProducerRepository {

    EnergyProducer save(EnergyProducer producer);
}

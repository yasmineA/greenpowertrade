package org.agregiosolution.greenpowertrade.domaine;

import org.agregiosolution.greenpowertrade.domaine.entities.EnergyProducer;

public interface ProducerRepository {
    EnergyProducer save(EnergyProducer producer);
}

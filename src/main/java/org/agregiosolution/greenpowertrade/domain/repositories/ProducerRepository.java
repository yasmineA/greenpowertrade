package org.agregiosolution.greenpowertrade.domain.repositories;

import org.agregiosolution.greenpowertrade.domain.entities.EnergyProducer;
import org.agregiosolution.greenpowertrade.domain.entities.Market;

import java.util.List;

public interface ProducerRepository {

    EnergyProducer save(EnergyProducer producer);

    List<EnergyProducer> getProducersByMarket(Market.MarketType market);


}

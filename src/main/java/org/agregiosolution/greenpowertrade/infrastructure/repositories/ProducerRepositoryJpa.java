package org.agregiosolution.greenpowertrade.infrastructure.repositories;

import org.agregiosolution.greenpowertrade.domain.entities.Market;
import org.agregiosolution.greenpowertrade.infrastructure.entities.EnergyProducerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProducerRepositoryJpa extends JpaRepository<EnergyProducerEntity, Long> {
    @Query("select distinct p from EnergyProducer p join p.contributions c join c.timeBlock b join b.offer o where o.market.type=:market")
    List<EnergyProducerEntity> findProducersByMarket(Market.MarketType market);
}

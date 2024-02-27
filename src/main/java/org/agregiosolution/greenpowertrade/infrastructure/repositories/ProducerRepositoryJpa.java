package org.agregiosolution.greenpowertrade.infrastructure.repositories;

import org.agregiosolution.greenpowertrade.infrastructure.entities.EnergyProducerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducerRepositoryJpa extends JpaRepository<EnergyProducerEntity, Long> {

}

package org.agregiosolution.greenpowertrade.infrastructure;

import org.agregiosolution.greenpowertrade.infrastructure.entities.OfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepositoryJpa extends JpaRepository<OfferEntity,Long> {
}

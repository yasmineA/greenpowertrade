package org.agregiosolution.greenpowertrade.infrastructure.repositories;

import org.agregiosolution.greenpowertrade.infrastructure.entities.OfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OfferRepositoryJpa extends JpaRepository<OfferEntity, Long> {
}

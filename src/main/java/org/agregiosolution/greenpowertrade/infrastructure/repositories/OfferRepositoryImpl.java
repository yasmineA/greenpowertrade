package org.agregiosolution.greenpowertrade.infrastructure.repositories;

import org.agregiosolution.greenpowertrade.domain.entities.Offer;
import org.agregiosolution.greenpowertrade.domain.repositories.OfferRepository;
import org.agregiosolution.greenpowertrade.infrastructure.mappers.OfferJpaEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class OfferRepositoryImpl implements OfferRepository {
    private final OfferRepositoryJpa offerRepository;
    private final OfferJpaEntityMapper offerJpaEntityMapper;

    public OfferRepositoryImpl(OfferRepositoryJpa offerRepository, OfferJpaEntityMapper offerJpaEntityMapper) {
        this.offerRepository = offerRepository;
        this.offerJpaEntityMapper = offerJpaEntityMapper;
    }

    @Override
    public Offer save(Offer offer) {
        return offerJpaEntityMapper.mapToOffer(offerRepository.save(offerJpaEntityMapper.mapToOfferEntity(offer)));
    }

    @Override
    public Set<Offer> getOffers() {
        return offerJpaEntityMapper.mapToOffers(offerRepository.findAll());
    }
}

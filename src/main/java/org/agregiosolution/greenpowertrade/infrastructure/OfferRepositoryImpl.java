package org.agregiosolution.greenpowertrade.infrastructure;

import org.agregiosolution.greenpowertrade.domaine.OfferRepository;
import org.agregiosolution.greenpowertrade.domaine.entities.Offer;
import org.agregiosolution.greenpowertrade.infrastructure.entities.OfferEntity;
import org.springframework.stereotype.Repository;

@Repository
public class OfferRepositoryImpl implements OfferRepository {
    OfferRepositoryJpa offerRepository;
    OfferMapper offerMapper;

    public OfferRepositoryImpl(OfferRepositoryJpa offerRepository, OfferMapper offerMapper) {
        this.offerRepository = offerRepository;
        this.offerMapper = offerMapper;
    }

    @Override
    public Offer save(Offer offer) {
        OfferEntity offerEntity = offerRepository.save(offerMapper.mapToOfferEntity(offer));
        return offerMapper.mapToOffer(offerEntity);
    }

    @Override
    public OfferEntity save(OfferEntity offer) {
        return offerRepository.save(offer);
    }
}

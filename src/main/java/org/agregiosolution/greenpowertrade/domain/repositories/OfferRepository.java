package org.agregiosolution.greenpowertrade.domain.repositories;

import org.agregiosolution.greenpowertrade.domain.entities.Offer;

import java.util.Set;

public interface OfferRepository {
    Offer save(Offer offer);

    Set<Offer> getOffers();
}

package org.agregiosolution.greenpowertrade.domaine;

import org.agregiosolution.greenpowertrade.domaine.entities.Offer;
import org.agregiosolution.greenpowertrade.infrastructure.entities.OfferEntity;

public interface OfferRepository {
    Offer save(Offer offer);

    OfferEntity save(OfferEntity offer);
}

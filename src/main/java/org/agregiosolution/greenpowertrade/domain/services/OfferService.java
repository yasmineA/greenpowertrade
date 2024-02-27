package org.agregiosolution.greenpowertrade.domain.services;


import org.agregiosolution.greenpowertrade.domain.entities.Market;
import org.agregiosolution.greenpowertrade.domain.entities.Offer;

import java.util.List;
import java.util.Map;

public interface OfferService {
    void createOffer(Offer offer);

    Map<Market, List<Offer>> getOffers();
}

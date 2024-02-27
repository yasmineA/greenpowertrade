package org.agregiosolution.greenpowertrade.application;

import org.agregiosolution.greenpowertrade.domaine.InconsistentContributionException;
import org.agregiosolution.greenpowertrade.domaine.OfferRepository;
import org.agregiosolution.greenpowertrade.domaine.OfferService;
import org.agregiosolution.greenpowertrade.domaine.entities.Offer;
import org.agregiosolution.greenpowertrade.domaine.entities.ProducerContribution;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }


    @Override
    public void createOffer(Offer offer) {
        if (!isValidContribution(offer)) {
            throw new InconsistentContributionException();
        }
        offerRepository.save(offer);
    }

    private boolean isValidContribution(Offer offer) {
        return offer.getTimeBlocks()
                .stream()
                .allMatch(timeBlock -> timeBlock.getProducersContribution()
                        .stream()
                        .mapToDouble(ProducerContribution::getMwContributed).sum() == timeBlock.getQuantityMW());

    }
}

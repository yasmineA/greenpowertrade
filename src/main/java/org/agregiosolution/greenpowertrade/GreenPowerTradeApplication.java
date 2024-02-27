package org.agregiosolution.greenpowertrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreenPowerTradeApplication {

    public static void main(String[] args) {

        SpringApplication.run(GreenPowerTradeApplication.class, args);
    }

   /* @Bean
    String testRepo(OfferRepository offerRepository) {
        OfferEntity offer = OfferEntity.builder()
                .market(MarketEntity.builder().type(Market.MarketType.RESERVE_PRIMAIRE.name()).build())
                .timeBlocks(Set.of(TimeBlockEntity.builder().floorPrice(20).quantityMW(10)
                        .contributionEntities(Set.of(
                                EnergyContributionEntity.builder().energyProducer(EnergyProducerEntity.builder().name("prod1").build()).mwContributed(10).build())).build())).build();

        offerRepository.save(offer);
        return "yes";
    }*/

}

package org.agregiosolution.greenpowertrade.infrastructure.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TimeBlock")
@EqualsAndHashCode(exclude = "contributions")
public class TimeBlockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double quantityMW;

    private double floorPrice;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private OfferEntity offer;

    @OneToMany(mappedBy = "timeBlock", cascade = CascadeType.PERSIST)
    private Set<EnergyContributionEntity> contributions;

    public void setContributions(Set<EnergyContributionEntity> contributionEntities) {
        this.contributions = contributionEntities;
        for (EnergyContributionEntity contributionEntity : contributionEntities) {
            contributionEntity.setTimeBlock(this);
        }
    }

}

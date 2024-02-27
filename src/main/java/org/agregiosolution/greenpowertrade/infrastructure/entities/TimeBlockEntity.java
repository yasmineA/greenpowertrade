package org.agregiosolution.greenpowertrade.infrastructure.entities;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Entity(name = "TimeBlock")
@Builder
public class TimeBlockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double quantityMW;
    private double floorPrice;

    @OneToMany(mappedBy = "timeBlock", cascade = CascadeType.PERSIST)
    private Set<EnergyContributionEntity> contributionEntities;

}

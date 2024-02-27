package org.agregiosolution.greenpowertrade.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Entity(name = "EnergyProducer")
@Builder
public class EnergyProducerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String name;

    @OneToMany(mappedBy = "energyProducer", cascade = CascadeType.PERSIST)
    private Set<EnergyContributionEntity> contributionEntities;

}

package org.agregiosolution.greenpowertrade.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Entity(name = "EnergyContribution")
@Builder
public class EnergyContributionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "energy_producer_id")
    private EnergyProducerEntity energyProducer;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "time_block_id")
    private TimeBlockEntity timeBlock;

    private double mwContributed;
}

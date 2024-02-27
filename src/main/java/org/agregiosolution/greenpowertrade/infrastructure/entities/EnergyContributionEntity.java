package org.agregiosolution.greenpowertrade.infrastructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "EnergyContribution")
public class EnergyContributionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "energy_producer_id")
    private EnergyProducerEntity producer;

    @ManyToOne
    @JoinColumn(name = "time_block_id")
    private TimeBlockEntity timeBlock;

    private double mwContributed;
}

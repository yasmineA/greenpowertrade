package org.agregiosolution.greenpowertrade.domaine.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProducerContribution {
    private EnergyProducer producer;
    private double mwContributed;
}

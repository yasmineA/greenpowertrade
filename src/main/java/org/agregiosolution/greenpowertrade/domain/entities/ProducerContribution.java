package org.agregiosolution.greenpowertrade.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProducerContribution {
    private EnergyProducer producer;
    private double mwContributed;
}

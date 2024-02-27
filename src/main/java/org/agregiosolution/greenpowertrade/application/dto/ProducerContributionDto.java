package org.agregiosolution.greenpowertrade.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProducerContributionDto {
    private EnergyProducerDto producer;
    private double mwContributed;
}

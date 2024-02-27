package org.agregiosolution.greenpowertrade.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeBlock {
    private Long id;
    private double quantityMW;
    private double floorPrice;
    private Set<ProducerContribution> contributions;

}

package org.agregiosolution.greenpowertrade.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TimeBlockDto {

    private Long id;
    private double quantityMW;
    private double floorPrice;
    private Set<ProducerContributionDto> contributions;
}

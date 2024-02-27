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
public class OfferDto {
    private Long id;
    private MarketDto market;
    private Set<TimeBlockDto> timeBlocks;
}

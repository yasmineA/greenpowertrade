package org.agregiosolution.greenpowertrade.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Market {
    private Long id;
    private MarketType type;

    public enum MarketType {
        RESERVE_PRIMAIRE,
        RESERVE_SECONDAIRE,
        RESERVE_RAPIDE;
    }
}

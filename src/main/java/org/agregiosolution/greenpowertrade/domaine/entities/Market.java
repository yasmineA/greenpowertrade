package org.agregiosolution.greenpowertrade.domaine.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Market {
    private Long id;
    private MarketType type;

    public enum MarketType {
        RESERVE_PRIMAIRE,
        RESERVE_SECONDAIRE,
        RESERVE_RAPIDE;
    }
}

package org.agregiosolution.greenpowertrade.domain.entities;

public record Market(Long id, MarketType type) {

    public enum MarketType {
        RESERVE_PRIMAIRE,
        RESERVE_SECONDAIRE,
        RESERVE_RAPIDE;
    }
}

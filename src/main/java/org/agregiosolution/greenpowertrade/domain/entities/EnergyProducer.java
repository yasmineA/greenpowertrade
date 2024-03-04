package org.agregiosolution.greenpowertrade.domain.entities;

public record EnergyProducer(Long id, EnergyType type, String name) {
    public enum EnergyType {
        SOLAIRE,
        EOLIEN,
        HYDRAULIQUE;
    }
}

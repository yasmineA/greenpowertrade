package org.agregiosolution.greenpowertrade.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnergyProducer {
    private Long id;
    private EnergyType type;
    private String name;


    public enum EnergyType {
        SOLAIRE,
        EOLIEN,
        HYDRAULIQUE;
    }
}
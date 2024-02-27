package org.agregiosolution.greenpowertrade.domaine.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
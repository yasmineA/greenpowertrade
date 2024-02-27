package org.agregiosolution.greenpowertrade.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnergyProducerDto {
    private Long id;
    private EnergyType type;
    private String name;

    public enum EnergyType {
        SOLAIRE,
        EOLIEN,
        HYDRAULIQUE;
    }
}
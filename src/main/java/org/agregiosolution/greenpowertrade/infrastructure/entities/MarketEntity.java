package org.agregiosolution.greenpowertrade.infrastructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Entity(name = "Market")
@Builder
public class MarketEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String type;
}

package org.agregiosolution.greenpowertrade.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Entity(name = "Offer")
@Builder
public class OfferEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // a modifier
    @ManyToOne(cascade = CascadeType.PERSIST)
    private MarketEntity market;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<TimeBlockEntity> timeBlocks;
}

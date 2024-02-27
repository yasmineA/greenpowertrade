package org.agregiosolution.greenpowertrade.infrastructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Offer")
@EqualsAndHashCode(exclude = "timeBlocks")
public class OfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private MarketEntity market;

    @OneToMany(mappedBy = "offer", cascade = CascadeType.PERSIST)
    private Set<TimeBlockEntity> timeBlocks;

    public void setTimeBlocks(Set<TimeBlockEntity> timeBlocks) {
        this.timeBlocks = timeBlocks;
        for (TimeBlockEntity timeBlockEntity : timeBlocks) {
            timeBlockEntity.setOffer(this);
        }
    }

}

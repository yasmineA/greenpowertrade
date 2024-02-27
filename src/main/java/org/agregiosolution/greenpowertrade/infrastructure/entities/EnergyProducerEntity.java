package org.agregiosolution.greenpowertrade.infrastructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.agregiosolution.greenpowertrade.domain.entities.EnergyProducer.EnergyType;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "EnergyProducer")
@EqualsAndHashCode(exclude = "contributions")
public class EnergyProducerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EnergyType type;

    private String name;

    @OneToMany(mappedBy = "producer", cascade = CascadeType.PERSIST)
    private Set<EnergyContributionEntity> contributions;

    public void setContributions(Set<EnergyContributionEntity> contributionEntities) {
        this.contributions = contributionEntities;
        for (EnergyContributionEntity contributionEntity : contributionEntities) {
            contributionEntity.setProducer(this);
        }
    }

}

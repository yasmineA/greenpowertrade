package org.agregiosolution.greenpowertrade.domaine.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Offer {
    private Long id;
    private Market market;
    private Set<TimeBlock> timeBlocks;

}

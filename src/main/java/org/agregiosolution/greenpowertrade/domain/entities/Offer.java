package org.agregiosolution.greenpowertrade.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offer {
    private Long id;
    private Market market;
    private Set<TimeBlock> timeBlocks;

}

package org.agregiosolution.greenpowertrade.domain.entities;


import java.util.Set;

public record Offer(Long id, Market market, Set<TimeBlock> timeBlocks) {
}


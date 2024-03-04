package org.agregiosolution.greenpowertrade.domain.entities;

import java.util.Set;

public record TimeBlock(Long id, double quantityMW, double floorPrice, Set<ProducerContribution> contributions) {
}

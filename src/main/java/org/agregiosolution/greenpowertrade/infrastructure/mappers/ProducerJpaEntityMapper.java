package org.agregiosolution.greenpowertrade.infrastructure.mappers;


import org.agregiosolution.greenpowertrade.domain.entities.EnergyProducer;
import org.agregiosolution.greenpowertrade.infrastructure.entities.EnergyProducerEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProducerJpaEntityMapper {


    EnergyProducerEntity mapToProducerJpaEntity(EnergyProducer producer);

    EnergyProducer mapToProducer(EnergyProducerEntity producer);

    List<EnergyProducer> mapToProducers(List<EnergyProducerEntity> producers);

}


package org.agregiosolution.greenpowertrade.application.mappers;


import org.agregiosolution.greenpowertrade.application.dto.EnergyProducerDto;
import org.agregiosolution.greenpowertrade.domain.entities.EnergyProducer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProducerDtoMapper {

    EnergyProducerDto toEnergyProducerDto(EnergyProducer producer);

    EnergyProducer toEnergyProducer(EnergyProducerDto dto);
}

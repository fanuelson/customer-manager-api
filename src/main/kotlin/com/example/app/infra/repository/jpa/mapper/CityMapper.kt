package com.example.app.infra.repository.jpa.mapper

import com.example.app.domain.model.City
import com.example.app.infra.repository.jpa.entities.CityEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CityMapper {

  fun toDomain(entity: CityEntity): City

}
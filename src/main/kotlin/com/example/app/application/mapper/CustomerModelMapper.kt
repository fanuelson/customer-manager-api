package com.example.app.application.mapper

import com.example.app.application.port.`in`.CreateCustomerCommand
import com.example.app.domain.model.Customer
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface CustomerModelMapper {

  @Mapping(target = "id", ignore = true)
  fun toDomain(command: CreateCustomerCommand): Customer
}
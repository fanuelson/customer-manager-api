package com.example.app.infra.repository.jpa.mapper

import com.example.app.domain.model.Customer
import com.example.app.infra.repository.jpa.entities.CustomerEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CustomerMapper {

  fun toDomain(value: CustomerEntity): Customer
  fun toEntity(value: Customer): CustomerEntity

}
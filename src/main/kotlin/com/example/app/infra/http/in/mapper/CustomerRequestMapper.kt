package com.example.app.infra.http.`in`.mapper

import com.example.app.application.port.`in`.CreateCustomerCommand
import com.example.app.infra.http.`in`.resource.request.CreateCustomerRequest
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CustomerRequestMapper {

  fun toDomain(value: CreateCustomerRequest): CreateCustomerCommand
}
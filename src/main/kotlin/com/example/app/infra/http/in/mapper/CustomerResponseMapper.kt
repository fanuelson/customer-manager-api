package com.example.app.infra.http.`in`.mapper

import com.example.app.domain.model.Customer
import com.example.app.infra.http.`in`.resource.response.CustomerResponse
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CustomerResponseMapper {

  fun toResponse(value: Customer): CustomerResponse
}
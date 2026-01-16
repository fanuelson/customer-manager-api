package com.example.app.infra.http.`in`

import com.example.app.application.usecase.CreateCustomerUseCase
import com.example.app.application.usecase.FindAllCustomer
import com.example.app.infra.http.`in`.mapper.CustomerRequestMapper
import com.example.app.infra.http.`in`.mapper.CustomerResponseMapper
import com.example.app.infra.http.`in`.resource.request.CreateCustomerRequest
import com.example.app.infra.http.`in`.resource.response.CustomerResponse
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.*

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
class CustomerController(
  val customerRequestMapper: CustomerRequestMapper,
  val customerResponseMapper: CustomerResponseMapper,
  val createCustomerUseCase: CreateCustomerUseCase,
  val findAllCustomer: FindAllCustomer
) {

  @PostMapping
  fun create(@RequestBody request: CreateCustomerRequest): CustomerResponse {
    val command = customerRequestMapper.toDomain(request)
    val output = createCustomerUseCase.execute(command);
    return customerResponseMapper.toResponse(output.customer)
  }

  @GetMapping
  fun findAll(): Collection<CustomerResponse> {
    return findAllCustomer.execute().map(customerResponseMapper::toResponse)
  }
}
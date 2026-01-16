package com.example.app.application.usecase

import com.example.app.application.mapper.CustomerModelMapper
import com.example.app.application.port.`in`.CreateCustomerCommand
import com.example.app.application.port.`in`.CreateCustomerOutput
import com.example.app.application.port.out.CustomerRepository
import com.example.app.application.validator.CreateCustomerValidator
import org.springframework.stereotype.Service

@Service
class CreateCustomerUseCase(
  val customerRepository: CustomerRepository,
  val validator: CreateCustomerValidator,
  val mapper: CustomerModelMapper
) {

  fun execute(command: CreateCustomerCommand): CreateCustomerOutput {
    validator.validate(command)
    val customer = mapper.toDomain(command)
    val createdCustomer = customerRepository.save(customer)
    return CreateCustomerOutput(createdCustomer)
  }

}
package com.example.app.application.usecase

import com.example.app.application.port.out.CustomerRepository
import com.example.app.domain.model.Customer
import org.springframework.stereotype.Service

@Service
class FindAllCustomer(
  private val repository: CustomerRepository
) {

  fun execute(): Collection<Customer> {
    return repository.findAll()
  }
}
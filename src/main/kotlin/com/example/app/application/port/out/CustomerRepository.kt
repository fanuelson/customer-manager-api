package com.example.app.application.port.out

import com.example.app.domain.model.Customer

interface CustomerRepository {
  fun save(customer: Customer): Customer
  fun findAll(): List<Customer>
}
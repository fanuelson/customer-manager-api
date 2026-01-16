package com.example.app.infra.repository

import com.example.app.application.port.out.CustomerRepository
import com.example.app.domain.model.Customer
import com.example.app.infra.repository.jpa.CustomerJpaRepository
import com.example.app.infra.repository.jpa.mapper.CustomerMapper
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Repository

@Repository
@RequiredArgsConstructor
class CustomerRepositoryImpl(
  val repository: CustomerJpaRepository,
  val mapper: CustomerMapper
) : CustomerRepository {

  override fun save(customer: Customer): Customer {
    return customer
      .let(mapper::toEntity)
      .let(repository::save)
      .let(mapper::toDomain)
  }

  override fun findAll(): List<Customer> {
    return repository.findAll().map(mapper::toDomain)
  }

}
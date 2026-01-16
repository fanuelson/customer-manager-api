package com.example.app.application.port.`in`

import com.example.app.domain.model.Customer
import com.example.app.domain.model.Gender
import java.time.LocalDate

class CreateCustomerCommand(
  val fullName: String,
  val gender: Gender,
  val birthDate: LocalDate,
  val cityId: Long,
)

class CreateCustomerOutput(
  val customer: Customer
)
package com.example.app.infra.http.`in`.resource.request

import java.time.LocalDate

class CreateCustomerRequest(
  var fullName: String,
  var gender: String,
  var birthDate: LocalDate,
  var cityId: Long,
)
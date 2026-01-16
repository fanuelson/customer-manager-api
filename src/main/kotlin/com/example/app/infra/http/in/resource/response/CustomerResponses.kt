package com.example.app.infra.http.`in`.resource.response

import java.time.LocalDate

class CustomerResponse(
  var id: Long? = null,
  var fullName: String,
  var gender: String,
  var birthDate: LocalDate,
  var cityId: Long,
)
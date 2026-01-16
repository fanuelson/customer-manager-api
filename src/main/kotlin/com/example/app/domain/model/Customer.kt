package com.example.app.domain.model

import java.time.LocalDate

class Customer(
    var id: Long? = null,
    var fullName: String,
    var gender: Gender,
    var birthDate: LocalDate,
    var cityId: Long,
) {
}
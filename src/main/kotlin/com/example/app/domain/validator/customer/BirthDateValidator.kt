package com.example.app.domain.validator.customer

import com.example.app.domain.model.Customer
import com.example.app.domain.model.validation.ValidationError
import com.example.app.domain.model.validation.ValidationResult
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class BirthDateValidator: CustomerValidator {

  override fun validate(context: Customer): ValidationResult {

    val birthDate = context.birthDate
    if (birthDate.isAfter(LocalDate.now())) {
      return ValidationResult.invalid(
        ValidationError.of(
          "CUSTOMER_INVALID_BIRTH_DATE", "birthDate must be past."
        )
      )
    }

    return ValidationResult.valid()
  }

}
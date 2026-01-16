package com.example.app.domain.validator.customer

import com.example.app.domain.model.Customer
import com.example.app.domain.model.validation.ValidationError
import com.example.app.domain.model.validation.ValidationResult
import org.springframework.stereotype.Service

@Service
class FullNameValidator : CustomerValidator {

  override fun validate(context: Customer): ValidationResult {
    val errors = mutableListOf<ValidationError>()

    val fullName = context.fullName
    if (fullName.isBlank()) {
      errors.add(
        ValidationError.of(
          "CUSTOMER_BLANK_FULLNAME", "full must is blank."
        )
      )
    }

    if (!fullName.contains(" ")) {
      errors.add(
        ValidationError.of(
          "CUSTOMER_SINGLE_FULL_NAME", "full name is single name.", "Nome completo por favor"
        )
      )
    }

    return ValidationResult.invalid(errors)
  }

}
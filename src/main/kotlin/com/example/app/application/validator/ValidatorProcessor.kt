package com.example.app.application.validator

import com.example.app.domain.model.validation.ValidationResult
import com.example.app.domain.validator.Validator

class ValidatorProcessor<T>(
  val validator: Validator<T>
) {

  fun validate(context: T): ValidationResult {
    val result = validator.validate(context)
    return ValidationResult.invalid(result.getErrors())
  }

  companion object {
    fun <T> join(validators: List<Validator<T>>): Validator<T>
      = validators.reduce { acc, validator -> acc.and(validator) }

    fun <T> of(validators: List<Validator<T>>): ValidatorProcessor<T>
      = ValidatorProcessor(join(validators))
  }
}
package com.example.app.domain.validator

import com.example.app.domain.model.validation.ValidationResult

fun interface Validator<C> {
  fun validate(context: C): ValidationResult

  fun and(other: Validator<C>): Validator<C> =
    Validator { context ->
      ValidationResult.invalid(
        listOf(this.validate(context), other.validate(context))
          .flatMap { it.getErrors() }
      )
    }
}
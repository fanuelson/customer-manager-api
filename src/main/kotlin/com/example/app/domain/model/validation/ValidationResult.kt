package com.example.app.domain.model.validation


data class ValidationResult (
  private val errors: List<ValidationError>
) {

  companion object {
    fun valid() = ValidationResult(emptyList())
    fun invalid(errors: List<ValidationError>) = ValidationResult(errors)
    fun invalid(error: ValidationError) = invalid(listOf(error))
  }

  fun getErrors() = errors
  fun isInvalid(): Boolean = errors.isNotEmpty()

}
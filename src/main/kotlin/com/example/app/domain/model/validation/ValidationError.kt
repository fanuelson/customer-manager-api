package com.example.app.domain.model.validation

data class ValidationError(
  val code: String,
  val message: String,
  val externalMessage: String? = null,
  val extra: Any? = null,
) {

  companion object {
    fun of(code: String, message: String, externalMessage: String? = null, extra: Any? = null): ValidationError
      = ValidationError(code, message, externalMessage, extra)
  }
}
package com.example.app.domain.exception

import com.example.app.domain.model.validation.ValidationError
import java.util.Optional.ofNullable

class BusinessValidationException(
  val errors: List<ValidationError>
): BusinessException(buildMessage(errors)) {

  companion object {
    private fun buildMessage(errors: List<ValidationError>): String {
      return errors.joinToString(", ") {
        ofNullable(it.externalMessage).orElse(it.message)
      }
    }
  }
}
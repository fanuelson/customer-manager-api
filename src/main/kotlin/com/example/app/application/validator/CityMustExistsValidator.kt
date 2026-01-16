package com.example.app.application.validator

import com.example.app.application.port.out.CityRepository
import com.example.app.domain.model.validation.ValidationError
import com.example.app.domain.model.validation.ValidationResult
import com.example.app.domain.validator.Validator
import org.springframework.stereotype.Service

@Service
class CityMustExistsValidator(
  val cityRepository: CityRepository
): Validator<Long> {

  override fun validate(context: Long): ValidationResult {
    val notFound = !cityRepository.exists(context)
    if(notFound) {
      return ValidationResult.invalid(
        ValidationError.of("CITY_NOT_FOUND", "city not found")
      )
    }

    return ValidationResult.valid()
  }

}
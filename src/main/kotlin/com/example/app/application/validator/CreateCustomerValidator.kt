package com.example.app.application.validator

import com.example.app.application.mapper.CustomerModelMapper
import com.example.app.application.port.`in`.CreateCustomerCommand
import com.example.app.domain.exception.BusinessValidationException
import com.example.app.domain.validator.customer.CustomerValidator
import org.springframework.stereotype.Service

@Service
class CreateCustomerValidator(
  val createCustomerValidators: List<CustomerValidator>,
  val cityMustExistsValidator: CityMustExistsValidator,
  val customerModelMapper: CustomerModelMapper
) {

  fun validate(command: CreateCustomerCommand) {
    val customer = customerModelMapper.toDomain(command)

    val validationResult = ValidatorProcessor
      .of(createCustomerValidators)
      .validate(customer)

    if(validationResult.isInvalid()) {
      throw BusinessValidationException(validationResult.getErrors())
    }

    val cityValidationResult = cityMustExistsValidator.validate(command.cityId)
    if(cityValidationResult.isInvalid()) {
      throw BusinessValidationException(cityValidationResult.getErrors())
    }
  }

}

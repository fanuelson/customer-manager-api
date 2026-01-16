package com.example.app.infra.http.`in`.handler

import com.example.app.domain.exception.BusinessValidationException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class GlobalExceptionHandler {

  @ExceptionHandler(BusinessValidationException::class)
  fun handleBusinessValidation(ex: BusinessValidationException): ResponseEntity<String> {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.message)
  }

}
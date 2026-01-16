package com.example.app.domain.exception

open class BusinessException(
  message: String,
  throwable: Throwable? = null
) : RuntimeException(message, throwable)
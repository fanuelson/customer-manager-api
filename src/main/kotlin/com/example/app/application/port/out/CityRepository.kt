package com.example.app.application.port.out

import com.example.app.domain.model.City
import java.util.*

interface CityRepository {
  fun exists(id: Long): Boolean
  fun findById(id: Long): Optional<City>
}
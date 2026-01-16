package com.example.app.infra.repository

import com.example.app.application.port.out.CityRepository
import com.example.app.domain.model.City
import com.example.app.infra.repository.jpa.CityJpaRepository
import com.example.app.infra.repository.jpa.mapper.CityMapper
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
@RequiredArgsConstructor
class CityRepositoryImpl(
  val repository: CityJpaRepository,
  val mapper: CityMapper
) : CityRepository {

  override fun exists(id: Long): Boolean {
    return repository.existsById(id);
  }

  override fun findById(id: Long): Optional<City> {
    return repository.findById(id).map(mapper::toDomain)
  }

}
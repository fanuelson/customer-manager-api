package com.example.app.infra.repository.jpa

import com.example.app.infra.repository.jpa.entities.CityEntity
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation
import org.springframework.stereotype.Repository

@Repository
interface CityJpaRepository : JpaRepositoryImplementation<CityEntity, Long>
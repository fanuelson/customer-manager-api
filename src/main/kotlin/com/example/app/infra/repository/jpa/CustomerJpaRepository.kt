package com.example.app.infra.repository.jpa

import com.example.app.infra.repository.jpa.entities.CustomerEntity
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation
import org.springframework.stereotype.Repository

@Repository
interface CustomerJpaRepository : JpaRepositoryImplementation<CustomerEntity, Long>
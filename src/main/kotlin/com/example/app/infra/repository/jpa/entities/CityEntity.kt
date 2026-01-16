package com.example.app.infra.repository.jpa.entities

import com.example.app.domain.model.State
import jakarta.persistence.*
import org.springframework.data.jpa.domain.support.AuditingEntityListener

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "city")
class CityEntity(

  @Id
  var id: Long? = null,

  @Column(name = "name", nullable = false)
  var name: String,

  @Enumerated(EnumType.STRING)
  @Column(name = "state", nullable = false)
  var state: State,

)
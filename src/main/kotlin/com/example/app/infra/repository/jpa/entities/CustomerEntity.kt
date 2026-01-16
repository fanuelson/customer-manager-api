package com.example.app.infra.repository.jpa.entities

import com.example.app.domain.model.Gender
import jakarta.persistence.*
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "customer")
class CustomerEntity(

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,

  @Column(name = "full_name", nullable = false)
  var fullName: String,

  @Enumerated(EnumType.STRING)
  @Column(name = "gender", nullable = false)
  var gender: Gender,

  @Column(name = "birth_date", nullable = false)
  var birthDate: LocalDate,

  @Column(name = "city_id", nullable = false)
  var cityId: Long,

)
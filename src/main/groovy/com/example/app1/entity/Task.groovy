package com.example.app1.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.validation.constraints.NotNull
import javax.persistence.Column

@Entity
@Table(name = "tasks")
class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id

  @NotNull
  @Column(nullable = false)
  String title

  @NotNull
  @Column(nullable = false)
  String description
}
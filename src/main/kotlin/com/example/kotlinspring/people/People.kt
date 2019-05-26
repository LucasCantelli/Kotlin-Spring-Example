package com.example.kotlinspring.people

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class People (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val name: String = ""
)
package com.example.kotlinspring.equipe

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Equipe (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val nome: String
)
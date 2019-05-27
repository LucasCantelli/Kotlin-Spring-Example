package com.example.kotlinspring.equipe

import javax.persistence.*

@Entity
data class Equipe (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val nome: String
)
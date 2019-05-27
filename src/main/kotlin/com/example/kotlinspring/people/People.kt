package com.example.kotlinspring.people

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class People (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val nome: String = "",

        val idade: String = "",

        val sexo: String = "",

        val usuario: String = "",

        val senha: String = "",

        val cpf: String = "",

        val email: String = "",

        val rg: String = "",

        val cargo: String = "",

        val endereco: String = ""

        //TODO
        //val equipe: Equipe = ""
)
package com.example.kotlinspring.people

import com.example.kotlinspring.equipe.Equipe
import javax.persistence.*

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

        val endereco: String = "",

        @OneToMany
        val equipe: List<Equipe>
)
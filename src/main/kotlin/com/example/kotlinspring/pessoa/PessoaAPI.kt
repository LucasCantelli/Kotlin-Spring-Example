package com.example.kotlinspring.pessoa

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PessoaAPI(private val pessoaRepository: PessoaRepository) {
    @GetMapping("/pessoa")
    fun getPessoa(): List<Pessoa> =
            pessoaRepository.findAll()
}
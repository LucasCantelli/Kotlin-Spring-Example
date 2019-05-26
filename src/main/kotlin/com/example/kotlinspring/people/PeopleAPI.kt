package com.example.kotlinspring.people

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PeopleAPI(private val peopleRepository: PeopleRepository) {
    @GetMapping("/people")
    fun getPeople(): List<People> =
            peopleRepository.findAll();
}
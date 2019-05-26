package com.example.kotlinspring.people

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PeopleRepository : JpaRepository<People, Long>
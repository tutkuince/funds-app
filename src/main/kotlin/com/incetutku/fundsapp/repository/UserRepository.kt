package com.incetutku.fundsapp.repository

import com.incetutku.fundsapp.model.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}
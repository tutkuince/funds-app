package com.incetutku.fundsapp.repository

import com.incetutku.fundsapp.model.entity.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long> {

    fun findByUserId(userId: Long): List<Account?>
}
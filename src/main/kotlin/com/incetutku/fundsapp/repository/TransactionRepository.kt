package com.incetutku.fundsapp.repository

import com.incetutku.fundsapp.model.entity.Transaction
import com.incetutku.fundsapp.model.enum.TransactionType
import org.springframework.data.jpa.repository.JpaRepository

interface TransactionRepository : JpaRepository<Transaction, Long> {

    fun findByUserId(userId: Long): List<Transaction>

    fun findByUserIdAndTransactionType(userId: Long, transactionType: TransactionType): List<Transaction>

}
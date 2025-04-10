package com.incetutku.fundsapp.service

import com.incetutku.fundsapp.model.dto.FundsDTO
import com.incetutku.fundsapp.model.entity.Transaction
import com.incetutku.fundsapp.model.enum.TransactionType
import com.incetutku.fundsapp.repository.TransactionRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class FundsService(
    val transactionRepository: TransactionRepository
) {

    @Transactional
    fun handleDeposit(fundsDTO: FundsDTO, userId: Long): Transaction {
        val transaction: Transaction = Transaction()
        transaction.userId = userId
        transaction.amount = fundsDTO.amount
        transaction.transactionType = TransactionType.DEPOSIT

        return transactionRepository.save(transaction)
    }

    @Transactional
    fun handleWithdraw(fundsDTO: FundsDTO, userId: Long): Transaction {
        val transaction: Transaction = Transaction()
        transaction.userId = userId
        transaction.amount = fundsDTO.amount
        transaction.transactionType = TransactionType.WITHDRAW

        return transactionRepository.save(transaction)
    }

    @Transactional
    fun handleTransfer(fundsDTO: FundsDTO, userId: Long): Transaction {
        val transaction: Transaction = Transaction()
        transaction.userId = userId
        transaction.amount = fundsDTO.amount
        transaction.transactionType = TransactionType.TRANSFER

        return transactionRepository.save(transaction)
    }

    @Transactional
    fun handleSend(fundsDTO: FundsDTO, userId: Long): Transaction {
        val transaction: Transaction = Transaction()
        transaction.userId = userId
        transaction.amount = fundsDTO.amount
        transaction.transactionType = TransactionType.SEND

        return transactionRepository.save(transaction)
    }
}
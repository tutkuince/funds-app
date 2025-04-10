package com.incetutku.fundsapp.service

import com.incetutku.fundsapp.model.entity.Account
import com.incetutku.fundsapp.model.enum.AccountType
import com.incetutku.fundsapp.repository.AccountRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*
import kotlin.jvm.optionals.getOrElse

@Service
class AccountService(
    val accountRepository: AccountRepository,
    val userService: UserService
) {

    @Transactional
    fun saveAccount(account: Account): Account {
        return accountRepository.save(account)
    }

    @Transactional
    fun deleteAccount(account: Account): Unit {
        accountRepository.delete(account)
    }

    @Transactional(readOnly = true)
    fun findAccountById(id: Long): Optional<Account> {
        return accountRepository.findById(id)
    }

    @Transactional
    fun createAccount(userId: Long, accountType: AccountType): Account {
        val user = userService.getUserById(userId).getOrElse { throw Exception("User not found") }

        val account: Account = Account()
        account.name = "${user.name} ${account.name} " + UUID.randomUUID()
        account.balance = 0.0
        account.user = user

        return saveAccount(account)
    }

}
package com.incetutku.fundsapp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transactions")
class FundsController {

    @GetMapping
    fun getTransactions(): String {
        return "Get Transactions"
    }

    @PostMapping("/deposit")
    fun handleDeposits(): String {
        return "Deposits"
    }

    @PostMapping("/withdraw")
    fun handleWithdraw(): String {
        return "Withdraw"
    }

    @PostMapping("/transfer")
    fun handleTransfer(): String {
        return "Transfer"
    }

    @PostMapping("/send")
    fun handleSend(): String {
        return "Send"
    }
}
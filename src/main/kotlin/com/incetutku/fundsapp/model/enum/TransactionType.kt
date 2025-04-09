package com.incetutku.fundsapp.model.enum

enum class TransactionType(val type: String) {
    DEPOSIT("DEPOSIT"),
    TRANSFER("TRANSFER"),
    WITHDRAW("WITHDRAW"),
    SEND("SEND")
}
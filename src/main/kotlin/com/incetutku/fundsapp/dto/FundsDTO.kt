package com.incetutku.fundsapp.dto

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull

data class FundsDTO(
    var receiverEmail: String = "",

    @field:NotNull(message = "Amount needs a valid value")
    @field:Min(0, message = "Amount must be greater than 0")
    var amount: Double,

    @field:NotNull(message = "Need a proper accountId")
    var fromAccountId: Long,

    @field:NotNull(message = "Need a proper accountId")
    var toAccountId: Long
)

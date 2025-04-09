package com.incetutku.fundsapp.model.entity

import com.fasterxml.jackson.annotation.JsonInclude
import com.incetutku.fundsapp.model.enum.TransactionType
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*

@Entity
@Table(name = "transactions")
@JsonInclude(JsonInclude.Include.NON_NULL)
class Transaction {

    @Id
    @GeneratedValue
    var id :Long? = null
    var amount :Double = 0.0
    var userId: Long = 0
    var fromAccountId :Long? = null
    var toAccountId :Long? = null

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var transactionType: TransactionType? = null

    @CreationTimestamp
    val createdAt: Date? = null
    @UpdateTimestamp
    val updatedAt: Date? = null
}
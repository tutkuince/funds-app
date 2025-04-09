package com.incetutku.fundsapp.model.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.incetutku.fundsapp.model.enum.AccountType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import jakarta.validation.constraints.Min
import org.hibernate.annotations.Check
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*

@Entity
@Table(name = "accounts")
@Check(constraints = "balance >= 0")
class Account {

    @Id
    @GeneratedValue
    var id: Long? = null

    var name: String = ""

    @Min(0)
    var balance: Double = 0.0
    var accountType: AccountType? = null

    @CreationTimestamp
    val createdAt: Date? = null

    @UpdateTimestamp
    val updatedAt: Date? = null

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    lateinit var user: User
}
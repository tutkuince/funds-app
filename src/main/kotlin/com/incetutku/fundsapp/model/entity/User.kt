package com.incetutku.fundsapp.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*

@Entity
@Table(name = "users")
class User {

    @Id
    @GeneratedValue
    var id: Long? = null
    var name: String = ""
    var surname: String = ""
    var email: String = ""
    var password: String = ""
    var age: Int = 0
    var defaultAccountId: Long? = null

    @CreationTimestamp
    val createdAt: Date? = null

    @UpdateTimestamp
    val updatedAt: Date? = null

    @OneToMany(mappedBy = "user")
    var accounts :Set<Account>? = null
}
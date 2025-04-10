package com.incetutku.fundsapp.service

import com.incetutku.fundsapp.model.entity.User
import com.incetutku.fundsapp.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.Optional

@Service
class UserService(
    val userRepository: UserRepository
) {

    @Transactional(readOnly = true)
    fun getUserByEmail(email: String): User {
        return userRepository.findByEmail(email).orElseThrow { Exception("User not found") }
    }

    @Transactional(readOnly = true)
    fun getUserById(id: Long): Optional<User> {
        return userRepository.findById(id)
    }

    @Transactional
    fun saveUser(user: User): User {
        return userRepository.save(user)
    }

}
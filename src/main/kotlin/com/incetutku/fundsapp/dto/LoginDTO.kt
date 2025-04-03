package com.incetutku.fundsapp.dto

import java.beans.ConstructorProperties

data class LoginDTO
@ConstructorProperties
constructor(
    val email: String,
    val password: String
)

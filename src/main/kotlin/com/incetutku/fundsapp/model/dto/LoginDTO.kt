package com.incetutku.fundsapp.model.dto

import java.beans.ConstructorProperties

data class LoginDTO
@ConstructorProperties
constructor(
    val email: String,
    val password: String
)

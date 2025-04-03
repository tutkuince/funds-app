package com.incetutku.fundsapp.dto

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class SignUpDTO(
    @field:NotBlank(message = "Name cannot be null and must have greater length than 0")
    @field:NotEmpty(message = "Name cannot be empty")
    var name: String?,
    @field:NotBlank(message = "Surname cannot be null and must have greater length than 0")
    @field:NotEmpty(message = "Name cannot be null")
    var surname: String?,
    @field:NotBlank(message = "Email cannot be null and must have greater length than 0")
    @field:NotEmpty(message = "Email cannot be null")
    var email: String?,
    @field:NotBlank(message = "Password cannot be null")
    @field:NotEmpty(message = "Password cannot be null")
    @field:Size(min = 8, max = 64, message = "Password must be between 4 and 64 characters long")
    var password: String?,
    @field:NotNull(message = "Age cannot be null")
    @field:Min(16, message = "Must be at least 16 to sign up for an account")
    @field:Max(90, message = "Must be between the age of 16 to 90")
    var age: Int?

)

package com.incetutku.fundsapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FundsAppApplication

fun main(args: Array<String>) {
    runApplication<FundsAppApplication>(*args)
}

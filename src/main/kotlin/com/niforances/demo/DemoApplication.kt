package com.niforances.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

@Value("\${my-app.welcome-message}")
var welcomeMsg: String = ""

fun main(args: Array<String>) {

    println("$welcomeMsg !!!")

    runApplication<DemoApplication>(*args)
}

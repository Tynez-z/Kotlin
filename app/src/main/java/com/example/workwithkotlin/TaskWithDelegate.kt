package com.example.workwithkotlin
import kotlin.reflect.KProperty

lateinit var a: String

class User {
    var Task: String by DelegatedUser()
}

class DelegatedUser {
    operator fun getValue(user: User, property: KProperty<*>): String {
        return "$user, Get value '${property.name}'"
    }

    operator fun setValue(user: User, property: KProperty<*>, value: String) {
        println("Set value: $value значение '${property.name} у $user'")
    }
}

fun main(args: Array<String>) {
    var user = User()
    println(user.Task)
    user.Task = "123"

    if (::a.isInitialized) {
        println("a is initialized")
    } else {
        println("a isn't initialized")
    }
}



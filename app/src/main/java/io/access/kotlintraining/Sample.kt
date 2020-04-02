package io.access.kotlintraining

fun welcome() {
    println("welcome to ACCESS!")
}

// TODO: declare hello function
fun main(args: Array<String>) {
    //Hello World!
    println("Hello world")


    //Fizz Buzz
    fizzBuzz()
}

fun fizzBuzz() {
    for (i in 1..100) {

        when {
            i % 15 == 0 -> println("FizzBuzz")
            i % 5 == 0 -> println("Buzz")
            i % 3 == 0 -> println("Fizz")
            else -> println("$i")
        }
    }
}
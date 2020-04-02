package io.access.kotlintraining

import kotlin.math.pow

fun welcome() {
    println("welcome to ACCESS!")
}

// TODO: declare hello function
fun main(args: Array<String>) {
    //Hello World!
    println("Hello world")


    //Fizz Buzz
    fizzBuzz()
    print("\n\n\n")
    print(isLeapYear(2000))
    print("\n\n\n")
    print(power(10,10))
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

fun fizzBuzzForTest(i: Int): String {
    return when {
        i % 15 == 0 -> "FizzBuzz"
        i % 5 == 0 -> "Buzz"
        i % 3 == 0 -> "Fizz"
        else -> "$i"
    }
}

// うるう年かどうかを判定する関数
fun isLeapYear(y: Int): Boolean {
    // TODO: 実装する
    //うるう年は4で割り切れることが前提
    if (y % 4 != 0) {
        return false
    }

    //100で割り切れて、400で割り切れないとうるう年ではない
    if (y % 100 == 0 && y % 400 != 0) {
        return false
    }
    return true
}

fun power(a: Int, n: Int): Long {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0
    }
    // TODO: 実装する
    val aDouble = a.toDouble()
    val nDouble = n.toDouble()

    return aDouble.pow(nDouble).toLong()
}
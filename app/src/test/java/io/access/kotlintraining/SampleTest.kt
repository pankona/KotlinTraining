package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        // TODO: implement to call hello function
    }
}

class FizzBuzzTest {
    @Test
    fun testFizzBuzz() {
        // TODO: テストを書く
        // assertEquals 等の assert 系 function を使おう
        // 以下の kotlin.test パッケージのリファレンスも参照のこと
        // https://kotlinlang.org/api/latest/kotlin.test/kotlin.test/index.html
        assertEquals("FizzBuzz", fizzBuzzForTest(15))
        assertEquals("8", fizzBuzzForTest(8))
        assertEquals("Fizz", fizzBuzzForTest(12))
        assertEquals("Buzz", fizzBuzzForTest(35))
    }
}
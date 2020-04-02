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

class LeapYearTest {
    @Test
    fun testIsLeapYear() {
        assertEquals(true, isLeapYear(1600))
        assertEquals(false, isLeapYear(1700))
        assertEquals(false, isLeapYear(2500))
        assertEquals(true, isLeapYear(72))
        assertEquals(false, isLeapYear(71))
    }
}

class TestPower{
    @Test
    fun testPower(){
        assertEquals(100, power(10,2))
        assertEquals(1000, power(10,3))
        assertEquals(625, power(25,2))
        assertEquals(15625, power(25,3))
        assertEquals(1, power(1,1))
    }
}
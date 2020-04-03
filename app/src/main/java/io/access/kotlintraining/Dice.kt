package io.access.kotlintraining

import java.util.*

//n 面のサイコロ
class Dice(n: Int) {
    private var numberOfTimes: Int = 0

    private val diceFace = n

    fun roll(): Int {
        numberOfTimes += 1
        val random = Random()
        return if (numberOfTimes < 100) {
            random.nextInt(diceFace) + 1 // 1〜n までの範囲の値がランダムで返る
        } else {
            throw Exception("I was broken")
        }
    }
}
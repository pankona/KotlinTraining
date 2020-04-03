package io.access.kotlintraining

//世界のナベアツ
class NabeAtsu {
    // TODO: 実装する
    var n: Int = 0

    fun next(): String {
        // TODO: 実装する
        n++
        val isInclude = n.toString().contains("3")
        return if (n % 3 == 0 || isInclude) {
            "aho"
        } else "$n"
    }
}
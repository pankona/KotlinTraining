package io.access.kotlintraining

//呼び出した回数をカウントする
class MyCustomClass {
    var counter: Int = 0
    var propertyWithCounter: Int = 0
        /* TODO: ここにカスタムセッターを書く */
        set(value) {
            // 値は field変数に格納する
            field = value
            counter++
        }
}
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
    print(isLeapYear(2000))
    print(power(10, 10))
    print("\n\n")
    print(5.isOdd())
    print("\n")
    print(5.isEven())
    print("\n\n")

    //n面のサイコロ
    val d = Dice(16)
    print("Dice roll start.\n")
    for (i in 1..99) {
        println(d.roll())
    }
    print("\n\n")

    //呼び出された回数をカウントする
    val p = MyCustomClass()
    p.propertyWithCounter = 123
    p.propertyWithCounter = 456
    p.propertyWithCounter = 789
    println(p.counter) // 3
    print("\n\n")

    //世界のナベアツ
    val n = NabeAtsu()
    for (i in 1..100) {
        println(n.next())
    }

    print("\n\n")
    //ヌルと戦うJavaプログラマーにKotlinを教えよう！
    val personalInfo = PersonalInfo("antonio@abc-company.com")
    val client = Client(personalInfo)
    val mailer: Mailer = CosmosMailer()
    sendMessageToClient(
            client,
            "Hello, Antonio!",
            mailer
    )

    print("以上が解答となります。みなさん研修頑張ってください^^")
}

//fizzBuzz
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

//累乗
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

//奇数か偶数か
fun Int.isOdd(): Boolean {
    return this % 2 == 0
}

fun Int.isEven(): Boolean {
    return this % 2 != 0
}

//ヌルと戦うJavaプログラマーにKotlinを教えよう！
fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    if (client == null || message == null) {
        return
    }

    val personalInfo: PersonalInfo? = client.personalInfo ?: return
    val email: String = personalInfo?.email ?: return

    mailer.sendMessage(email, message)
}
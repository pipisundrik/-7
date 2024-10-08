fun main() {
    println("Введите слово:")
    val a = readLine()!!.lowercase()

    if (isPalindrome(a)) {
        println("$a - это палиндром")
    } else {
        println("$a - это не палиндром")
    }
}

fun isPalindrome(a: String): Boolean {
    return a == a.reversed()
}
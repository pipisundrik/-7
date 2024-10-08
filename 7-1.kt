fun main() {
    println("Калькулятор:)")

    while (true) {
        println("Введите первое число: ")
        val a = readLine()!!.toDouble()
        println("Введите второе число: ")
        val b = readLine()!!.toDouble()
        println("Выберите операцию (+, -, *, /):")
        val c = readLine()!!
        when (c) {
            "+" -> println("$a + $b = ${a + b}")
            "-" -> println("$a - $b = ${a - b}")
            "*" -> println("$a * $b = ${a * b}")
            "/" -> {
                if (b == 0.0) {
                    println("Деление на ноль невозможно")
                } else {
                    println("$a / $b = ${a / b}")
                }
            }
            else -> println("Нет такого варианта")
        }
        println("Хотите продолжить? (да/нет)")
        val d = readLine()!!
        if (d.lowercase() != "да") {
            break
        }
    }
    println("До свидания!")
}
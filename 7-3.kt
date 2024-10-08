fun main() {
    println("Подсчет очков команды:")
    println("Введите количество побед:")
    val a = readLine()!!.toInt()
    println("Введите количество ничьих:")
    val b = readLine()!!.toInt()
    println("Введите количество поражений:")
    val c = readLine()!!.toInt()
    val d = calculatePoints(a, b, c)
    println("Всего очков: $d")
    println("\nНайти минимальное число:")
    println("Введите список чисел, разделенных пробелами:")
    val g = readLine()!!
    val h = g.split(" ").map { it.toInt() }.toTypedArray()
    val n = findMin(h)
    println("Самое маленькое число: $n")

    println("\nСравнение двух чисел:")
    println("Введите первое число:")
    val l = readLine()!!.toInt()
    println("Введите второе число:")
    val j = readLine()!!.toInt()

    val y = compareNumbers(l, j)
    if (y) {
        println("Числа равны")
    } else {
        println("Числа не равны")
    }
}
fun calculatePoints(wins: Int, draws: Int, losses: Int): Int {
    return wins * 3 + draws
}
fun findMin(numbers: Array<Int>): Int {
    var min = numbers[0]
    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }
    return min
}
fun compareNumbers(num1: Int, num2: Int): Boolean {
    return num1 == num2
}
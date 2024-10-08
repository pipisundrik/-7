import kotlin.random.Random

fun main() {
    println("Добро пожаловать в игру 21!")

    while (true) {
        val a = createDeck()
        val b = mutableListOf<Int>()
        val c = mutableListOf<Int>()

        b.add(drawCard(a))
        b.add(drawCard(a))
        c.add(drawCard(a))
        c.add(drawCard(a))

        println("Ваши карты: ${b.joinToString(", ")} (сумма: ${sumHand(b)})")
        println("Карта дилера: ${c[0]}")

        while (true) {
            println("Хотите взять карту? (да/нет)")
            val d = readLine()!!.lowercase()
            if (d == "да") {
                b.add(drawCard(a))
                println("Ваши карты: ${b.joinToString(", ")} (сумма: ${sumHand(b)})")
                if (sumHand(b) > 21) {
                    println("Перебор! Вы проиграли.")
                    break
                }
            } else {
                break
            }
        }
        if (sumHand(b) <= 21) {

            while (sumHand(c) < 17) {
                c.add(drawCard(a))
                println("Дилер взял карту.")
            }
            println("Карты дилера: ${c.joinToString(", ")} (сумма: ${sumHand(c)})")

            if (sumHand(c) > 21) {
                println("Дилер перебрал! Вы выиграли.")
            } else {
                if (sumHand(c) > sumHand(b)) {
                    println("Дилер выиграл.")
                } else if (sumHand(c) < sumHand(b)) {
                    println("Вы выиграли!")
                } else {
                    println("Ничья.")
                }
            }
        }
        println("Хотите сыграть еще? (да/нет)")
        val f = readLine()!!.lowercase()
        if (f != "да") {
            break
        }
    }
    println("До свидания!:)")
}
fun createDeck(): List<Int> {
    val deck = mutableListOf<Int>()
    for (suit in 1..4) {
        for (rank in 2..10) {
            deck.add(rank)
        }
        deck.add(11)
        deck.add(10)
    }
    deck.shuffle()
    return deck
}
fun drawCard(deck: List<Int>): Int {
    return deck.random()
}
fun sumHand(hand: List<Int>): Int {
    var sum = 0
    var hasAce = false
    for (card in hand) {
        if (card == 11) {
            hasAce = true
        }
        sum += card
    }
    if (hasAce && sum > 21) {
        sum -= 10
    }
    return sum
}
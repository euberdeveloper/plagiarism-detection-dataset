package IR

fun main() {
    println("Miles       Kilometers")

    for (i in 1..10) {
        val kilometers = i * 1609
        println("$i${if (i < 10) "           " else "          "}$kilometers")
    }
}


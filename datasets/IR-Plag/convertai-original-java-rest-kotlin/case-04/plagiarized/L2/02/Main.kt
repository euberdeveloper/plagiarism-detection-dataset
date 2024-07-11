package IR

fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")

    var mil = 1
    while (mil <= 10) {
        println("$mil\t\t${mil * 1.609}")
        mil++
    }
}


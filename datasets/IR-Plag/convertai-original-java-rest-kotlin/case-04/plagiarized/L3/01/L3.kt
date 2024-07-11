package IR

fun main() {
    var mil = 0
    println("Miles\t\tKilometers")
    println("-------------------------------")
    mil = 1
    while (mil <= 10) {
        println("$mil\t\t${mil * 1.609}")
        mil++
    }
}


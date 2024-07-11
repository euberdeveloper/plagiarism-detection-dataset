package IR

fun main() {
    // declare MIL
    var mil = 1
    // Miles to kilometer
    println("Miles\t\tKilometers")
    println("-------------------------------")

    // Use while loop
    while (mil <= 10) {
        println("$mil\t\t${mil * 1.609}")
        mil++
    }
}


package IR

fun printMil(mil: Int) {
    for (i in 1..10) {
        println("$mil\t\t${mil * 1.609}")
        mil++
    }
}

fun main(args: Array<String>) {
    // declare MIL
    var mil = 1
    // Miles to kilometer
    println("Miles\t\tKilometers")
    println("-------------------------------")

    // Use while loop
    printMil(mil)
}


package IR

fun printMil(mil: Int) {
    var milVar = mil
    while (milVar <= 10) {
        println("$milVar\t\t${milVar * 1.609}")
        milVar++
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


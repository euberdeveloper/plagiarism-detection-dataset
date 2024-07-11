package IR

import java.util.Scanner

fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")
    var mil = 1
    print(mil)
}

fun print(mil: Int) {
    var milVar = mil
    while (milVar <= 10) {
        println("$milVar\t\t${milVar * 1.609}")
        milVar++
    } // looping dari 1 sampai 10
}


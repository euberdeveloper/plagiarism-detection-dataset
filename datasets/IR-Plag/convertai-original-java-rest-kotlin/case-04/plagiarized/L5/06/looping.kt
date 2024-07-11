package IR

import java.util.Scanner

fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")
    var mil = 1
    print(mil)
}

fun print(mil: Int) {
    for (i in mil..10) {
        println("$i\t\t${i * 1.609}")
    } // looping dari 1 sampai 10
}


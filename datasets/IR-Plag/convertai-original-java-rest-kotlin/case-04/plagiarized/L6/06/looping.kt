package IR

import java.util.Scanner

fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")
    print(1)
}

fun print(mil: Int) {
    for (i in mil..10) {
        val x = (i * 1.609).toInt()
        println("$i\t\t$x")
    }
}


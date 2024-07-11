package IR

import java.util.Scanner

fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")
    var mil = 1 // inisialisasi while pertama kali
    while (mil <= 10) {
        println("$mil\t\t${mil * 1.609}")
        mil++
    } // looping dari 1 sampai 10
}


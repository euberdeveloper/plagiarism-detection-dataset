package IR

fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")

    var miles = 1
    while (miles <= 10) {
        println("$miles\t\t${miles * 1.609}")
        miles++
    }
}


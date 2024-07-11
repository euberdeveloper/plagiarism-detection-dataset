package IR

fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")

    var m = 1
    while (m <= 10) {
        println("$m\t\t${m * 1.609}")
        m++
    }
}


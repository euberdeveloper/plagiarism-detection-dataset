package IR

fun main() {
    var m = 1
    println("Miles\t\tKilometers")
    println("-------------------------------")
    while (m <= 10) {
        println("$m\t\t${m * 1.609}")
        m++
    }
}


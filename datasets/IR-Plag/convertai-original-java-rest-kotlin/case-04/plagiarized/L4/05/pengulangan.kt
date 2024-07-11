package IR

fun hitHasil(m: Int) {
    var m = m
    while (m <= 10) {
        println("$m\t\t${m * 1.609}")
        m++
    }
}

fun main(args: Array<String>) {
    var m = 1
    println("Miles\t\tKilometers")
    println("-------------------------------")
    hitHasil(m)
}


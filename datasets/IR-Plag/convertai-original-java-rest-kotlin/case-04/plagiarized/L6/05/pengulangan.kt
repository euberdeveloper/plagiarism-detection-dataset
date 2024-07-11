package IR

fun hitHasil(a: Int) {
    for (i in a..10) {
        println("$i\t\t${i * 1.609}")
    }
}

fun main(args: Array<String>) {
    println("Miles\t\tKilometers")
    println("-------------------------------")
    hitHasil(1)
}


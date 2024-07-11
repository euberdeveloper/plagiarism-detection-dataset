package IR

fun hitHasil(m: Int) {
    for (a in m..10) {
        println("$a\t\t${a * 1.609}")
    }
}

fun main(args: Array<String>) {
    var m = 1
    println("Miles\t\tKilometers")
    println("-------------------------------")
    hitHasil(m)
}


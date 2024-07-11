package IR

fun print(mil: Int) {
    var mil = mil
    while (mil <= 10) {
        println("$mil\t\t${mil * 1.609}")
        mil++
    }
}

fun main(args: Array<String>) {
    var mil = 1
    println("Miles\t\tKilometers")
    println("-------------------------------")
    print(mil)
}


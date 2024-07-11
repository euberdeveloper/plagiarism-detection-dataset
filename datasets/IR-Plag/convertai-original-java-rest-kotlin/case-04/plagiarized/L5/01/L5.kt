package IR

fun print(mil: Int) {
    for (i in 0 until 10) {
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


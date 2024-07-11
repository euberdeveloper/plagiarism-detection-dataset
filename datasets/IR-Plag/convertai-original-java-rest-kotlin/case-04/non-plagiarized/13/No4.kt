package IR

/**
 * @author Elvark
 */
fun main(args: Array<String>) {
    val mil = 1609
    println("Miles\tKilometers")
    for (i in 1..10) {
        println("$i\t${i * mil}")
    }
}


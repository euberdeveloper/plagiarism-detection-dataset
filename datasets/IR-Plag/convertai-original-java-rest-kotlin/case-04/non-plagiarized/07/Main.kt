package IR

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
fun main(args: Array<String>) {
    var miles = 1
    println("Miles    Kilometer")
    for (i in 0 until 10) {
        val kilo = miles * 1.609
        println("$miles        $kilo")
        miles++
    }
}


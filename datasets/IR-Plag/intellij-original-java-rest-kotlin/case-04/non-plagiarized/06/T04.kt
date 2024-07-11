package IR

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
object T04 {
    @JvmStatic
    fun main(args: Array<String>) {
        var kilo: Double
        val milToKilo = 1.609
        println("Miles\tKilometers")
        for (i in 1..10) {
            kilo = i * milToKilo
            println(i.toString() + "\t" + kilo)
        }
    }
}

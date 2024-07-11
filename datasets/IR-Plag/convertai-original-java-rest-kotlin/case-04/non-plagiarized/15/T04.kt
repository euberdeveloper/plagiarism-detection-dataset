package IR

/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
object T04 {

    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val mil = 1609
        println("Miles\tKilometers")
        for (i in 1..10) {
            println("$i\t${i * mil}")
        }
    }
}


package IR

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level6 {
    @JvmStatic
    fun konversi(mile: Int) {
        if (mile != 11) {
            println("$mile\t\t${mile * 1.609}")
            konversi(mile + 1)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        konversi(1)
    }
}


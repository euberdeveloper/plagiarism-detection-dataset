package IR

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level5 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")

        convert()
    }

    //pakai for
    private fun convert() {
        for (mill in 1..10) {
            println("$mill\t\t${mill * 1.609}")
        }
    }
}


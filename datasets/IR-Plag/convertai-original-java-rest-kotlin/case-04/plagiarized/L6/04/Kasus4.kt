package IR

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object Kasus4 {
    @JvmStatic
    fun Konversi(miles: Int): Double {
        return if (miles <= 10) {
            println("$miles\t\t${miles * 1.609}")
            Konversi(miles + 1)
        } else {
            0.0
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // Use while loop
        Konversi(1)
    }
}


package IR

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object Kasus4 {
    @JvmStatic
    fun Konversi(miles: Int) {
        println("$miles\t\t${miles * 1.609}")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // Use for loop
        for (miles in 1..10) {
            Konversi(miles)
        }
    }
}


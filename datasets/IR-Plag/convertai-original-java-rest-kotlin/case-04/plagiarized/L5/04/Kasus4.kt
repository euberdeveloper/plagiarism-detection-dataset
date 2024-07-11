package IR

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object Kasus4 {
    fun Konversi(miles: Int): Double {
        return miles * 1.609
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // Use for loop
        for (miles in 1..10) {
            println("$miles\t\t${Konversi(miles)}")
        }
    }
}


package IR

/**
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
object Kasus4L4 {
    @JvmStatic
    fun main(args: Array<String>) {
        var counter = 1
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // Use while loop
        while (counter <= 10) {
            //Menampilkan hasil
            //counter = miles
            println("$counter\t\t${convertMilesToKilo(counter)}")
            counter++
        }
    }

    private fun convertMilesToKilo(miles: Int): Double {
        return miles * 1.609
    }
}


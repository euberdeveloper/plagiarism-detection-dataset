package IR

/**
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
object Kasus4L5 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // Use for loop
        for (i in 1..10) {
            //Menampilkan hasil
            //i = miles
            println("$i\t\t${convertMilesToKilo(i)}")
        }
    }

    private fun convertMilesToKilo(miles: Int): Double {
        return miles * 1.609
    }
}


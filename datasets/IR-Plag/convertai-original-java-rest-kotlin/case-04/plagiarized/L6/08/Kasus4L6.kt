package IR

/**
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
object Kasus4L6 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        showTable(10)
    }

    private fun showTable(jumlahData: Int) {
        for (i in jumlahData downTo 1) {
            //Menampilkan hasil
            val temp = jumlahData + 1 - i
            println("$temp\t\t${convertMilesToKilo(temp)}")
        }
    }

    private fun convertMilesToKilo(miles: Int): Double {
        return miles * 1.609
    }
}


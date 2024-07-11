package IR

/**
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
object Kasus1L6 {
    
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        //Print Welcome to java 5 kali
        cetakTeks("Welcome to Java")
    }

    private fun cetakTeks(teks: String) {
        var i = 5
        while (i > 0) {
            println(teks)
            i--
        }
    }
}


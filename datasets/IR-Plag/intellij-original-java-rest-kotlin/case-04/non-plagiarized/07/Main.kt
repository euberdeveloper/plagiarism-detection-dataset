package IR

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
object Main {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        var miles = 1
        print("Miles    Kilometer")
        for (i in 0..9) {
            val kilo = miles * 1.609
            println("")
            print("$miles        $kilo")
            miles++
        }
    }
}

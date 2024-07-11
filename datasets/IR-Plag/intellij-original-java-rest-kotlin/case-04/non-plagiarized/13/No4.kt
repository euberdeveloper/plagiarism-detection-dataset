package IR

/**
 *
 * @author Elvark
 */
object No4 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        // TODO code application logic here
        val mil = 1609
        println("Miles\tKilometers")
        for (i in 1..10) {
            println(i.toString() + "\t" + i * mil)
        }
    }
}

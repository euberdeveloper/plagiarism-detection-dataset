package IR

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
object Main {
    private var mile: Int = 1

    @JvmStatic
    fun main(args: Array<String>) {
        mile = 1
        println("Miles\t\tKilometers")
        println("-------------------------------")
        loops()
    }

    private fun loops() {
        // Use while loop
        for (i in 10 downTo 1) {
            println("$mile\t\t${mile * 1.609}")
            mile++
        }
    }
}


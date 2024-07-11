package IR

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
object Main {
    private var number: Int = 0

    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        print("Enter an integer: ")
        number = input.nextInt()
        for (i in 99999 downTo 1) {
            val remainder = number % 10
            print(remainder)
            number /= 10
            if (number == 0) {
                break
            }
        }

        println()
    }
}


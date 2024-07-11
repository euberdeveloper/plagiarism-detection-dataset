package IR

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level1 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter an integer: ")
        val input = java.util.Scanner(System.`in`)
        val number = input.nextInt()
        reverse(number)
    }

    //fungsi membalik
    private fun reverse(number: Int) {
        var num = number
        while (num != 0) {
            val remainder = num % 10
            print(remainder)
            num /= 10
        }
        println()
    }
}


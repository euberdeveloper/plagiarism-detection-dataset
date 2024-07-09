package IR

import java.util.*

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
        val sc = Scanner(System.`in`)

        print("Enter an integer: ")
        val number = sc.nextInt()

        reverse(number)
    }

    fun reverse(number: Int) {
        var number = number
        var tempDigit = 0

        while (number > 0) {
            tempDigit = number % 10
            print(tempDigit)
            number = number / 10
        }
    }
}




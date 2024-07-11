package IR

import java.util.*

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
object No5 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter an integer: ")
        val inp = sc.next()
        reverse(inp)
    }

    fun reverse(a: String) {
        for (i in a.length - 1 downTo 0) {
            print(a[i])
        }
    }
}

package IR

import java.util.*

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
object No6 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        // TODO code application logic here
        val arr = IntArray(10)
        val sc = Scanner(System.`in`)
        for (i in 0..9) {
            print("Read a number: ")
            arr[i] = sc.nextInt()
        }
        for (i in 9 downTo 0) {
            println(arr[i])
        }
    }
}

package IR

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //enter the number
        print("Enter an integer: ")
        val sc = Scanner(System.`in`)
        val nmb = sc.nextInt()
        //reverse number
        reverse(nmb)
    }

    fun reverse(nmb: Int) {
        var nmb = nmb
        while (nmb != 0) {
            val get = nmb % 10
            //output
            print(get)
            nmb = nmb / 10
        }
        println()
    }
}

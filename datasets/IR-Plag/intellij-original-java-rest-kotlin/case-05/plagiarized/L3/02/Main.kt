package IR

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var nmb = 0
        //enter the number
        print("Enter an integer: ")

        nmb = sc.nextInt()
        //reverse number
        reverse(nmb)
    }

    fun reverse(nmb: Int) {
        var nmb = nmb
        var get = 0
        while (nmb != 0) {
            get = nmb % 10
            //output
            print(get)
            nmb = nmb / 10
        }
        println()
    }
}

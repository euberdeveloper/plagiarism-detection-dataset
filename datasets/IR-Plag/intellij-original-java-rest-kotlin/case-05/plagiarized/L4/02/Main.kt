package IR

import java.util.*

object Main {
    var sc: Scanner = Scanner(System.`in`)
    fun input(): Int {
        print("Enter an integer: ")
        return sc.nextInt()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val nmb = input()
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

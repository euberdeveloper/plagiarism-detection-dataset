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
        var x = 1
        val rev = nmb.toString()
        do {
            print(rev[rev.length - x])
            x++
            nmb = nmb / 10
        } while (nmb != 0)
        println()
    }
}

package IR

import java.util.*

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
object Main {
    var nums: IntArray
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        nums = IntArray(10)

        for (i in 10 downTo 0) {
            //Read a number
            print(
                "Read a number: "
            )
            nums[i] = input.nextInt()
        }

        outputs()
    }

    fun outputs() {
        //Display the array
        var i = 9
        while (i >= 0) {
            println(nums[i--])
        }
    }
}

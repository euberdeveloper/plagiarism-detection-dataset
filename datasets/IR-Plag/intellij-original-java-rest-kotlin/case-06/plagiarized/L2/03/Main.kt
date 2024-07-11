package IR

import java.util.*

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val nums = IntArray(10)

        for (i in 0..9) {
            //Read a number
            print(
                "Read a number: "
            )
            nums[i] = input.nextInt()
        }


        //Display the array
        for (i in 9 downTo 0) {
            println(nums[i])
        }
    }
}

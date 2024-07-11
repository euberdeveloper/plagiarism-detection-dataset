package IR

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
object Main {
    @JvmField
    var nums: IntArray = IntArray(10)

    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)

        for (i in 0 until 10) {
            // Read a number
            print("Read a number: ")
            nums[i] = input.nextInt()
        }

        outputs()
    }

    private fun outputs() {
        // Display the array
        for (i in nums.size - 1 downTo 0) {
            println(nums[i])
        }
    }
}


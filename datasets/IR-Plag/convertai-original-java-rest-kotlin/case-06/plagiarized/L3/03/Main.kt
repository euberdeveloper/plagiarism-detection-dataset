package IR

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
fun main() {
    val input = java.util.Scanner(System.`in`)
    val nums = IntArray(10)
    
    for (i in 0 until 10) {
        //Read a number
        print("Read a number: ")
        nums[i] = input.nextInt()
    }
    
    //Display the array
    for (i in 9 downTo 0) {
        println(nums[i])
    }
}


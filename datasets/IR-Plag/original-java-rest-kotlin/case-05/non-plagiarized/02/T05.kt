package IR

import java.util.*

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
object T05 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        print("Enter a integer: ")
        val a = s.nextInt()
        reverse(a)
    }

    fun reverse(number: Int) {
        val temp = number.toString()
        for (i in temp.length downTo 1) {
            print(temp[i - 1])
        }
    }
}

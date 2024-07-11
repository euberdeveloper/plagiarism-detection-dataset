package IR

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
fun main() {
    print("Enter an integer: ")
    val input = readln().toInt()
    reverse(input)
}

fun reverse(number: Int) {
    var num = number
    while (num != 0) {
        val remainder = num % 10
        print(remainder)
        num /= 10
    }
    println()
}


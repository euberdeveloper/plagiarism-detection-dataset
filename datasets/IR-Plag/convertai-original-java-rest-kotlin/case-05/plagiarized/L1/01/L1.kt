package IR

fun main() {
    println("Enter an integer: ")
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


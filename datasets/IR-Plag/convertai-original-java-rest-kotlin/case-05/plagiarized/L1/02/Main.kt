package IR

fun main() {
    //enter the number
    print("Enter an integer: ")
    val input = readln().toInt()
    //reverse number
    reverse(input)
}

fun reverse(number: Int) {
    var num = number
    while (num != 0) {
        val remainder = num % 10
        //output
        print(remainder)
        num /= 10
    }
    println()
}


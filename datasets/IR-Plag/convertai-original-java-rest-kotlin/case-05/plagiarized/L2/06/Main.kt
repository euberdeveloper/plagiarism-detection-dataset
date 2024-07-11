package IR

fun main(args: Array<String>) {
    println("Enter an integer: ")
    val input = readLine()?.toIntOrNull() ?: return
    reverse(input)
}

fun reverse(angka: Int) {
    var num = angka
    while (num != 0) {
        val remainder = num % 10
        print(remainder)
        num /= 10
    }
    println()
}


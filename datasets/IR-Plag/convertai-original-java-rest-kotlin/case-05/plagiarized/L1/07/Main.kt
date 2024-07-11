package IR

fun main() {
    print("Enter an integer: ")
    val input = java.util.Scanner(System.`in`)
    val number = input.nextInt()
    // Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
    reverse(number)
}

fun reverse(number: Int) {
    // Di sini mengulang hingga number habis
    var num = number
    while (num != 0) {
        val remainder = num % 10
        print(remainder)
        num /= 10
    }
    println()
}


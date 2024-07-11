package IR

fun main() {
    println("Enter an integer: ")
    val input = readln().toInt()
    balik(input)
}

fun balik(nomor: Int) {
    var num = nomor
    while (num != 0) {
        val sisa = num % 10
        print(sisa)
        num /= 10
    }
    println()
}


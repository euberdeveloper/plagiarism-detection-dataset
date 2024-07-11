package IR

fun main() {
    var angka: Int
    print("Enter an integer: ")
    val input = java.util.Scanner(System.`in`)
    angka = input.nextInt()
    // Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
    while (angka != 0) {
        val remainder = angka % 10
        print(remainder)
        angka /= 10
    }
    println()
}


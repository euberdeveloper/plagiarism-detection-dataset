package IR

fun main() {
    var angka: Int
    print("Enter an integer: ")
    val input = java.util.Scanner(System.`in`)
    angka = input.nextInt()
    // Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
    for (i in angka..0 step -1) {
        val remainder = i % 10
        print(remainder)
    }
    println()
}


package IR

fun main() {
    var angka: Int
    print("Enter an integer: ")
    val input = java.util.Scanner(System.`in`)
    angka = input.nextInt()
    // Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
    for (i in angka.toString().reversed()) {
        print(i)
    }
    println()
}


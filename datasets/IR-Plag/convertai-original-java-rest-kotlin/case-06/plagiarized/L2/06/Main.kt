package IR

fun main() {
    val input = java.util.Scanner(System.`in`)
    val angka = IntArray(10)
    for (i in 0 until 10) {
        // Input angka pada bagian ini
        println("Read a number: ")
        angka[i] = input.nextInt()
    }
    // Menampilkan array
    for (i in 9 downTo 0) {
        println(angka[i])
    }
}


package IR

fun main() {
    val angka = IntArray(10)
    val input = java.util.Scanner(System.`in`)
    for (i in angka.indices) {
        print("Read a number: ")
        angka[i] = input.nextInt()
    }
    showArray(angka)
}

fun showArray(angka: IntArray) {
    for (i in angka.indices) {
        println(angka[i])
    }
}


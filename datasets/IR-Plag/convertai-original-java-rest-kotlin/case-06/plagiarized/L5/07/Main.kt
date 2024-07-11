package IR

fun main() {
    val angka = IntArray(10)
    val input = java.util.Scanner(System.`in`)
    for (i in angka.indices) {
        println("Read a number: ")
        angka[i] = input.nextInt()
    }
    showArray(angka)
}

fun showArray(angka: IntArray) {
    var i = 9
    while (i >= 0) {
        println(angka[i])
        i--
    }
}


package IR

fun main() {
    val angka = IntArray(10)
    val input = java.util.Scanner(System.`in`)
    for (i in 0 until 10) {
        println("Read a number: ")
        angka[i] = input.nextInt()
    }
    for (i in angka.size - 1 downTo 0) {
        println(angka[i])
    }
}


package IR

fun main() {
    val sc = java.util.Scanner(System.`in`)
    val angka = IntArray(10)

    for (i in 0 until 10) {
        print("Read a number: ")
        angka[i] = sc.nextInt()
    }

    for (i in 9 downTo 0) {
        println(angka[i])
    }
}


package IR

fun main() {
    val `in` = java.util.Scanner(System.`in`)
    val arrAngka = IntArray(10)

    for (x in 0 until 10) {
        print("Read a number: ")
        arrAngka[x] = `in`.nextInt()
    }

    for (x in 9 downTo 0) {
        println(arrAngka[x])
    }
}


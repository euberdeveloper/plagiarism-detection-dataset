package IR

fun main() {
    val input = java.util.Scanner(System.`in`)
    val num = IntArray(10)

    for (i in 0 until 10) {
        print("Read a number: ")
        num[i] = input.nextInt()
    }

    for (i in 9 downTo 0) {
        println(num[i])
    }
}


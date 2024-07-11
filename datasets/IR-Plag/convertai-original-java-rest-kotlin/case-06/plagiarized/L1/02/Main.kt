package IR

fun main(args: Array<String>) {
    val input = java.util.Scanner(System.`in`)
    val num = IntArray(10)

    for (i in 0 until 10) {
        println("Read a number: ")
        num[i] = input.nextInt()
    }

    for (i in 9 downTo 0) {
        println(num[i])
    }
}


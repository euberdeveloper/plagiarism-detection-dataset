package IR

fun printNumber(number: IntArray) {
    for (i in 9 downTo 0) {
        println(number[i])
    }
}

fun main(args: Array<String>) {
    val s = java.util.Scanner(System.`in`)
    val number = IntArray(10)

    for (i in 0 until 10) {
        print("Read a number: ")
        number[i] = s.nextInt()
    }

    printNumber(number)
}


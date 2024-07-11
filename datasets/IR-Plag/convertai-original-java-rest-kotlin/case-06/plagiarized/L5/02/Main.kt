package IR

fun printNumber(number: IntArray) {
    for (i in 9 downTo 0) {
        println(number[i])
    }
}

fun main(args: Array<String>) {
    val s = java.util.Scanner(System.`in`)
    val number = IntArray(10)
    var i = 0
    while (i < 10) {
        print("Read a number: ")
        number[i] = s.nextInt()
        i++
    }

    printNumber(number)
}


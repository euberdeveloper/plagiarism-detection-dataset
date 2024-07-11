package IR

fun printNumber(number: IntArray) {
    for (i in number.indices) {
        println(number[i])
    }
}

fun main(args: Array<String>) {
    val s = java.util.Scanner(System.`in`)
    val number = IntArray(10)
    var i = 9
    while (i >= 0) {
        print("Read a number: ")
        number[i] = s.nextInt()
        i--
    }
    printNumber(number)
}


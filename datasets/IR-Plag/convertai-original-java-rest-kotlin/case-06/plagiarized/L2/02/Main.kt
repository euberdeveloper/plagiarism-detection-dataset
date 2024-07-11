package IR

fun main(args: Array<String>) {
    val s = java.util.Scanner(System.`in`)
    val number = IntArray(10)

    for (i in 0 until 10) {
        // Input the number
        print("Read a number: ")
        number[i] = s.nextInt()
    }

    // Output the number
    for (i in 9 downTo 0) {
        println(number[i])
    }
}


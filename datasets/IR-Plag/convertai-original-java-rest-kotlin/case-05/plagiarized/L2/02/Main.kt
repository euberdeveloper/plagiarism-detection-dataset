package IR

fun main() {
    //enter the number
    print("Enter an integer: ")
    val sc = java.util.Scanner(System.`in`)
    val nmb = sc.nextInt()
    //reverse number
    reverse(nmb)
}

fun reverse(nmb: Int) {
    var num = nmb
    while (num != 0) {
        val get = num % 10
        //output
        print(get)
        num /= 10
    }
    println()
}


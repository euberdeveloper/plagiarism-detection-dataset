package IR

fun main() {
    val sc = java.util.Scanner(System.`in`)
    var nmb = 0
    //enter the number
    println("Enter an integer: ")

    nmb = sc.nextInt()
    //reverse number
    reverse(nmb)
}

fun reverse(nmb: Int) {
    var get = 0
    var num = nmb
    while (num != 0) {
        get = num % 10
        //output
        print(get)
        num /= 10
    }
    println()
}


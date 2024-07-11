package IR

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
fun main() {
    print("Enter an integer: ")
    val input = java.util.Scanner(System.`in`)
    var number = input.nextInt()
    while (number != 0) {
        val remainder = number % 10
        print(remainder)
        number /= 10
    }
    println()
}


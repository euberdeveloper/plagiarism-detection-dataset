package IR

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val masukkan = java.util.Scanner(System.`in`)
    var number: Int
    var sisaBagi: Int

    print("Enter an integer: ")
    number = masukkan.nextInt()

    while (number != 0) {
        sisaBagi = number % 10
        print(sisaBagi)
        number /= 10
    }
    println()
}


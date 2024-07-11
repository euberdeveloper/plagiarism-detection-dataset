package IR

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val masukkan = java.util.Scanner(System.`in`)
    val number = IntArray(10)

    // masukkan data
    for (a in 0 until 10) {
        print("Read a number: ")
        number[a] = masukkan.nextInt()
    }

    // tampilkan ke layar
    for (a in 9 downTo 0) {
        println(number[a])
    }
}


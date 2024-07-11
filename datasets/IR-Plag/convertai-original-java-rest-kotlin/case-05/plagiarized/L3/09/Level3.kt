package IR

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level3 {

    @JvmStatic
    fun main(args: Array<String>) {
        // cara lain memanggil scanner
        val input = java.util.Scanner(System.`in`)
        var angka: Int

        print("Enter an integer: ")
        angka = input.nextInt()
        reverse(angka)
    }

    // fungsi membalik
    private fun reverse(number: Int) {
        var num = number
        while (num != 0) {
            val sisa = num % 10
            print(sisa)
            num /= 10
        }
        println()
    }
}


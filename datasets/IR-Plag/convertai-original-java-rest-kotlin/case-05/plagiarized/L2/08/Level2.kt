package IR

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level2 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter an integer: ")
        val `in` = java.util.Scanner(System.`in`)
        val angka = `in`.nextInt()
        balik(angka)
    }

    //fungsi membalik
    private fun balik(angka: Int) {
        var temp = angka
        while (temp != 0) {
            val sisa = temp % 10
            print(sisa)
            temp /= 10
        }
        println()
    }
}


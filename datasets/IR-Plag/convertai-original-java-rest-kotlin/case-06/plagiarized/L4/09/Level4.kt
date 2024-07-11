package IR

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level4 {
    @JvmStatic
    fun main(args: Array<String>) {
        proses()
    }

    @JvmStatic
    fun proses() {
        val `in` = java.util.Scanner(System.`in`)
        val angka = IntArray(10)
        for (a in 0 until 10) {
            print("Read a number: ")
            angka[a] = `in`.nextInt()
        }

        for (b in 9 downTo 0) {
            println(angka[b])
        }
    }
}


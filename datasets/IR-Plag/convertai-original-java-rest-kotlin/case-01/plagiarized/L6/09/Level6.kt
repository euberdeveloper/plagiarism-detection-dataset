package IR

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level6 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = "Welcome to Java\n"
        keluaran(input)
    }

    private fun keluaran(kal: String) {
        var limit = 0 // batas perulangan
        while (limit != 5) { // perulangan sebanyak 5x
            println(kal)
            limit++
        }
    }
}


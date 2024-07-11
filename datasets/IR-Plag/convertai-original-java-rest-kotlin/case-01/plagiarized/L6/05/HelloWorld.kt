package IR

object HelloWorld {
    var s: String = ""

    fun Cetak() {
        for (a in 5 downTo 1) {
            println(s)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        s = "Welcome to Java"
        Cetak()
    }
}


package IR

object HelloWorld {
    var s: String = ""

    fun Cetak() {
        println(s)
        println(s)
        println(s)
        println(s)
        println(s)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        s = "Welcome to Java"
        Cetak()
        // 25779F8829AB7A7650E85A4CC871E6AC Ganteng
    }
}


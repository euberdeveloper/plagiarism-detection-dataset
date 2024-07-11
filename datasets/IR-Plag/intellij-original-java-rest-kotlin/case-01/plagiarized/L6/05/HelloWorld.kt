package IR

internal object HelloWorld {
    var s: String? = null
    fun Cetak() {
        for (a in 5 downTo 1) println(s)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        s = "Welcome to Java"
        // code to print "Welcome to Java"
        Cetak()


        //End of code
        // 25779F8829AB7A7650E85A4CC871E6AC Ganteng
    }
}
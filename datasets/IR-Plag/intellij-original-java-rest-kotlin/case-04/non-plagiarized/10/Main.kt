package IR

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles    Kilometers")
        for (i in 1..10) {
            println(i.toString() + "        " + i * 1609)
        }
    }
}

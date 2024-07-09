package IR

object T04 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles       Kilometers")

        for (i in 1..10) {
            if (i < 10) {
                println(i.toString() + "           " + i * 1609)
            } else {
                println(i.toString() + "          " + i * 1609)
            }
        }
    }
}
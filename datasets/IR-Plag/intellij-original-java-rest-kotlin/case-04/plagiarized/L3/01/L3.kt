package IR

object L3 {
    @JvmStatic
    fun main(args: Array<String>) {
        var mil = 0
        println("Miles\t\tKilometers")

        println("-------------------------------")

        mil = 1

        while (mil <= 10) {
            println(mil.toString() + "\t\t" + mil * 1.609)
            mil++
        }
    }
}

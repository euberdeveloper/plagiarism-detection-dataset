package IR

object L2 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")

        println("-------------------------------")

        var mil = 1

        while (mil <= 10) {
            println(mil.toString() + "\t\t" + mil * 1.609)
            mil++
        }
    }
}

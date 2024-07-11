package IR

object L4 {
    fun print(mil: Int) {
        var mil = mil
        while (mil <= 10) {
            println(mil.toString() + "\t\t" + mil * 1.609)
            mil++
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val mil = 1
        println("Miles\t\tKilometers")

        println("-------------------------------")

        print(mil)
    }
}

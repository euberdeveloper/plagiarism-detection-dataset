package IR

object L5 {
    fun print(mil: Int) {
        var mil = mil
        for (i in 0..9) {
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

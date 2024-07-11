package IR

object L1 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")

        println("-------------------------------")

        var miles = 1

        while (miles <= 10) {
            println(miles.toString() + "\t\t" + miles * 1.609)
            miles++
        }
    }
}

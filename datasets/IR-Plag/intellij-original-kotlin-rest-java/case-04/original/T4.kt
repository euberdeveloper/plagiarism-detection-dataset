package IR

object T4 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")

        // Use while loop
        var miles = 1
        while (miles <= 10) {
            println(miles.toString() + "\t\t" + miles * 1.609)
            miles++
        }
    }
}

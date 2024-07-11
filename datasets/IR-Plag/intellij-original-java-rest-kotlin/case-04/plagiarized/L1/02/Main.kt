package IR

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //Miles to kilometer
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

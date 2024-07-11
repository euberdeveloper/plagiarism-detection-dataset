package IR

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //Miles to kilometer
        println("Miles\t\tKilometers")
        println("-------------------------------")

        // Use while loop
        var mil = 1

        while (mil <= 10) {
            println(mil.toString() + "\t\t" + mil * 1.609)


            mil++
        }
    }
}

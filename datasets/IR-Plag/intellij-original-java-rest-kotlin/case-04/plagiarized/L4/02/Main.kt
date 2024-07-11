package IR

object Main {
    fun printMil(mil: Int) {
        var mil = mil
        while (mil <= 10) {
            println(mil.toString() + "\t\t" + mil * 1.609)


            mil++
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        //declare MIL
        val mil = 1
        //Miles to kilometer
        println("Miles\t\tKilometers")
        println("-------------------------------")

        // Use while loop
        printMil(mil)
    }
}

package IR

object Main {
    fun printMil() {
        for (i in 1..10) {
            println(i.toString() + "\t\t" + i * 1.609)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        //Miles to kilometer

        println("Miles\t\tKilometers")
        println("-------------------------------")

        // Use while loop
        printMil()
    }
}

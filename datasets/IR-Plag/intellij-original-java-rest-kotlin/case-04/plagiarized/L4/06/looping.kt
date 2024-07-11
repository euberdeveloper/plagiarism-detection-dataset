package IR

object looping {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        var mil: Int
        print(1.also { mil = it })
    }

    fun print(mil: Int) {
        var mil = mil
        while (mil <= 10) {
            println(mil.toString() + "\t\t" + mil * 1.609)
            mil++
        } //looping dari 1 sampai 10
    }
}
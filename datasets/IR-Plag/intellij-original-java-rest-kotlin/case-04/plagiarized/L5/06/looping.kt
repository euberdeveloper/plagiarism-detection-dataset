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
        for (i in mil..10) {
            println(i.toString() + "\t\t" + i * 1.609)
        } //looping dari 1 sampai 10
    }
}
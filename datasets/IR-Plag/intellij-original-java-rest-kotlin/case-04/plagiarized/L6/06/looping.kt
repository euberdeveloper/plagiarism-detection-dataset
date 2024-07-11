package IR

object looping {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        print(1)
    }

    fun print(mil: Int) {
        var x: Int
        for (i in mil..10) {
            x = (i * 1.609).toInt()
            println(i.toString() + "\t\t" + x)
        } //looping dari 1 sampai 10
    }
}
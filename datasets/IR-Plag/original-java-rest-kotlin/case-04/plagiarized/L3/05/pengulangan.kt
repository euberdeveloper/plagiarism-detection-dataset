package IR

internal object inputoutput {
    @JvmStatic
    fun main(args: Array<String>) {
        var m = 1
        // print seusatu
        println("Miles\t\tKilometers")
        println("-------------------------------")

        // pake pengulangan while
        while (m <= 10) {
            println(m.toString() + "\t\t" + m * 1.609)
            m++
            //ditambahin iteratornya
        }
    }
}
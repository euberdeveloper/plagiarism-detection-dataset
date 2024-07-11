package IR

internal object inputoutput {
    @JvmStatic
    fun main(args: Array<String>) {
        // print seusatu
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // pake pengulangan while
        var m = 1
        while (m <= 10) {
            println(m.toString() + "\t\t" + m * 1.609)
            m++
            //ditambahin iteratornya
        }
    }
}
package IR

internal object inputoutput {
    fun hitHasil(m: Int) {
        var m = m
        while (m <= 10) {
            println(m.toString() + "\t\t" + m * 1.609)
            m++
            //ditambahin iteratornya
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val m = 1
        // print seusatu
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // pake pengulangan while
        hitHasil(m)
    }
}
package IR

internal object inputoutput {
    fun hitHasil(m: Int) {
        for (a in m..10) {
            println(a.toString() + "\t\t" + a * 1.609)
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
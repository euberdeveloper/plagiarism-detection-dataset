package IR

internal object inputoutput {
    fun hitHasil(a: Int) {
        var a = a
        while (a <= 10) {
            println(a.toString() + "\t\t" + a * 1.609)
            a++
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // print seusatu
        print("Miles\t\tKilometers\n")
        print("-------------------------------\n")
        // pake pengulangan while
        hitHasil(1)
    }
}
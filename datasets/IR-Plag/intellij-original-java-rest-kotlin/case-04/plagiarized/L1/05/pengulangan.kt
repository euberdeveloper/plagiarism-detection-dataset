package IR

internal object inputoutput {
    @JvmStatic
    fun main(args: Array<String>) {
        // print seusatu
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // pake pengulangan while
        var miles = 1
        while (miles <= 10) {
            println(miles.toString() + "\t\t" + miles * 1.609)
            miles++
            //ditambahin iteratornya
        }
    }
}
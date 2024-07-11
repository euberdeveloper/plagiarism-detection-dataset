package IR

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
object T04 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles       Kilometers")
        for (i in 1..10) {
            if (i == 10) {
                println(i.toString() + "          " + i * 1609)
            } else {
                println(i.toString() + "           " + i * 1609)
            }
        }
    }
}

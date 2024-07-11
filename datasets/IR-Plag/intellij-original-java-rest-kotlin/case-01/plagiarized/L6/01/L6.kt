package IR

object L6 {
    fun print() {
        for (i in 5 downTo 1) {
            print("Welcome to Java\n")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        print()
    }
}

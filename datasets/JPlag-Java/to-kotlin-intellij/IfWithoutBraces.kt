package java

object IfWithoutBraces {
    @JvmStatic
    fun main(args: Array<String>) {
        requireNotNull(args)
        if (args.size > 1) println(args.contentToString())
        else println(args[0])
    }
}

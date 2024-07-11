package IR

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object WelcomeToJava {
    @JvmStatic
    fun test(i: Int): String {
        return if (i > 0) {
            println("Welcome To Java")
            test(i - 1)
        } else {
            ""
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val i = 5
        test(i)
    }
}


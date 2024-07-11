package IR

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object Kasus5 {
    
    fun reverse(number: Int) {
        var num = number
        while (num != 0) {
            val remainder = num % 10
            print(remainder)
            num /= 10
        }

        println()
    }
    
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")
        val input = Scanner(System.`in`)
        val number = input.nextInt()
        
        reverse(number)
    }
}


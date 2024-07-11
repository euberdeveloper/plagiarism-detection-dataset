package IR

/**
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
object Kasus5L1 {
    @JvmStatic
    fun main(args: Array<String>) {
        //input data
        print("Enter an integer: ")
        val input = java.util.Scanner(System.`in`)
        val number = input.nextInt()
        reverse(number)
    }

    private fun reverse(number: Int) {
        //proses membalikkan angka
        var num = number
        while (num != 0) {
            //mengambil angka terakhir
            val remainder = num % 10
            //tampilkan angka yang diambil
            print(remainder)
            //membuang angka terakhir
            num /= 10
        }
        println()
    }
}


package IR

/**
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
fun main(args: Array<String>) {
    // Deklarasi
    val input = java.util.Scanner(System.`in`)
    val num = IntArray(10)
    // for untuk 10 kali input
    for (i in 0 until 10) {
        // Read a number
        print("Read a number: ")
        num[i] = input.nextInt()
    }
    // Display the array
    for (i in 9 downTo 0) {
        // Print angka dalam array
        println(num[i])
    }
}


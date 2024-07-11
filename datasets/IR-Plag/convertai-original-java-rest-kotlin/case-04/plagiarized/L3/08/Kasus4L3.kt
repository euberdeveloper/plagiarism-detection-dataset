package IR

/**
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
fun main() {
    var counter = 1
    println("Miles\t\tKilometers")
    println("-------------------------------")
    // Use while loop
    while (counter <= 10) {
        //Menampilkan hasil
        //counter = miles
        println("$counter\t\t${counter * 1.609}")
        counter++
    }
}


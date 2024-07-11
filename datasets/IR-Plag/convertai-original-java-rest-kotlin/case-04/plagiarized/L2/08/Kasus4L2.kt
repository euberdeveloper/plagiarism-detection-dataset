package IR

fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")
    // Use while loop
    var counter = 1
    while (counter <= 10) {
        //Menampilkan hasil
        //counter = miles
        println("$counter\t\t${counter * 1.609}")
        counter++
    }
}


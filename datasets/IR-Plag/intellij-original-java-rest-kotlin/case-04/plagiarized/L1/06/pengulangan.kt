package IR

object pengulangan {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        var miles = 1 //inisialisasi while pertama kali
        while (miles <= 10) {
            println(miles.toString() + "\t\t" + miles * 1.609)
            miles++
        } //looping dari 1 sampai 10
    }
}
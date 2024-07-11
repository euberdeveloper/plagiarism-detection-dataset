package IR

fun main() {
    var nomor: Int
    var sisa = 0
    println("Enter an integer: ")
    val input = readln().toInt()
    nomor = input
    
    while (nomor != 0) {
        sisa = nomor % 10
        print(sisa)
        nomor /= 10
    }
    println()
}


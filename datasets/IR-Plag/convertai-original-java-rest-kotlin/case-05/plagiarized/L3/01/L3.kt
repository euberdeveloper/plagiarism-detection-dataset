package IR

fun main() {
    var nomor = 0
    println("Enter an integer: ")
    
    val input = readln().toInt()
    
    balik(input)
}

fun balik(nomor: Int) {
    var sisa = 0
    while (nomor != 0) {
        sisa = nomor % 10
        print(sisa)
        nomor /= 10
    }
    println()
}


package IR

fun main() {
    var nomor = 0
    println("Enter an integer: ")
    
    val input = java.util.Scanner(System.`in`)
    
    nomor = input.nextInt()
    
    var sisa = 0
    while (nomor != 0) {
        sisa = nomor % 10
        print(sisa)
        nomor /= 10
    }
    println()
}


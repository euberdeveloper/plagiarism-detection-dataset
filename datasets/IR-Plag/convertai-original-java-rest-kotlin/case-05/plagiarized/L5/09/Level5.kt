package IR

import java.util.Scanner

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val masukkan = Scanner(System.`in`)
    var angka: Int
    var sisaBagi: Int

    print("Enter an integer: ")
    angka = masukkan.nextInt()

    while (angka != 0) { //ulang sampai tidak bisa dibagi integer dengan 10
        sisaBagi = angka % 10
        print(sisaBagi)
        angka /= 10
    }
    println()
}


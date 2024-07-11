package IR

import java.util.Scanner

/**
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter an integer: ")
    val a = sc.nextInt()
    val b = a.toString()
    for (i in b.length - 1 downTo 0) {
        print(b[i])
    }
}


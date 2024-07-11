package IR

import java.util.Scanner

fun print(arr: IntArray) {
    var i = 9
    var j = 0
    while (j < 10) {
        println(arr[i])
        i--
        j++
    }
}

fun main(args: Array<String>) {
    val angka = IntArray(10)
    val sc = Scanner(System.`in`)
    var i = 0
    while (i != 10) {
        print("Read a number: ")
        angka[i] = sc.nextInt()
        i++
    }

    print(angka)
}


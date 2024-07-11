package IR

import java.text.DecimalFormat

/**
 *
 * @author 4900D0A19B6894A4A514E9FF3AFCC2C0
 */
fun main() {
    val arr = Array(11) { IntArray(2) }
    val df = DecimalFormat("#.###")
    for (i in 0..10) {
        if (i == 0) {
            println("Miles \t Kilometers")
        } else {
            println("$i \t ${df.format(i * 1.609)}")
        }
    }
}


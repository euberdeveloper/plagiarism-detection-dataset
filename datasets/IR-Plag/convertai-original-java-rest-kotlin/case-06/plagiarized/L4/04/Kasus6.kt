package IR

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object Kasus6 {
    
    fun simpanArray(arr: IntArray, n: Int) {
        val sc = java.util.Scanner(System.`in`)
        
        for (i in 0 until n) {
            println("Read a number: ")
            arr[i] = sc.nextInt()
        }
    }
    
    fun tampilArray(arr: IntArray, n: Int) {
        for (i in n - 1 downTo 0) {
            println(arr[i])
        }
    }
    
    @JvmStatic
    fun main(args: Array<String>) {
        val n = 10
        val arr = IntArray(n)
        simpanArray(arr, n)
        tampilArray(arr, n)
    }
}


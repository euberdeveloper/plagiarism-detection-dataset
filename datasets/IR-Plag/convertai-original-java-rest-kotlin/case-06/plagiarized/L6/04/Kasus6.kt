package IR

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object Kasus6 {
    
    fun simpanArray(arr: IntArray, i: Int) {
        val sc = java.util.Scanner(System.`in`)
        
        if (i > 0) {
            simpanArray(arr, i - 1)
            println("Read a number: ")
            arr[i - 1] = sc.nextInt()
        }
        
    }
    
    fun tampilArray(arr: IntArray, i: Int) {
        if (i >= 0) {
            println(arr[i])
            tampilArray(arr, i - 1)
        }
    }
    
    @JvmStatic
    fun main(args: Array<String>) {
        val n = 10
        val arr = IntArray(n)
        simpanArray(arr, n)
        tampilArray(arr, n - 1)
    }
}


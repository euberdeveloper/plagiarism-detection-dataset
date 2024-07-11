package IR

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //print "welcome to java" 5x
        val java = "Welcome To Java"
        var baris = 9
        while (baris >= 0) {
            print(java)
            println()
            baris -= 2
        }
    }
}

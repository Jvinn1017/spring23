fun main() {
    val sales = IntArray(5)
    for (i in 1..5) {
        print("Enter today's sales for store $i: ")
        sales[i - 1] = readLine()!!.toInt()
    }
    println("\nSALES BAR CHART")
    for (i in 1..5) {
        print("Store $i: ")
        repeat(sales[i - 1] / 100) {
            print("*")
        }
        println()
    }
}

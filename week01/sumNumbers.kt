fun main() {
    print("Enter a positive nonzero integer value: ")
    val num = readLine()!!.toInt()

    var sum = 0
    for (i in 1..num) {
        sum += i
    }

    println("The sum of all integers from 1 to $num is $sum.")
}

fun main() {
    println(fibonacci(1))
    println(fibonacci(2))
    println(fibonacci(3))
    println(fibonacci(4))
    println(fibonacci(5))
    println(fibonacci(6))
    println(fibonacci(7))
    println(fibonacci(10))
}

fun fibonacci(number: Int): Int {
    if (number <= 0) {
        return 0
    } else if (number == 1 || number == 2) {
        return 1
    } else {
        var num1 = 0
        var num2 = 1
        var total = 0
        for (i in 1 until number) {
            total = num1 + num2
            num1 = num2
            num2 = total
        }
        return total
    }
}

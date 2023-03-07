fun main() {
    println("Enter the starting number of organisms:")
    var population = readLine()?.toInt() ?: 0
    while (population < 2) {
        println("Starting population must be at least 2. Please enter a valid number:")
        population = readLine()?.toInt() ?: 0
    }

    println("Enter the average daily population increase as a percentage:")
    var increasePercentage = readLine()?.toDouble() ?: 0.0
    while (increasePercentage < 0) {
        println("Increase percentage cannot be negative. Please enter a valid number:")
        increasePercentage = readLine()?.toDouble() ?: 0.0
    }

    println("Enter the number of days the population will multiply:")
    var days = readLine()?.toInt() ?: 0
    while (days < 1) {
        println("Number of days must be at least 1. Please enter a valid number:")
        days = readLine()?.toInt() ?: 0
    }

    println("Day 1: $population")
    for (i in 2..days) {
        population += (population * increasePercentage / 100).toInt()
        println("Day $i: $population")
    }
}

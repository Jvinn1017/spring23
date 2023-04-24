fun main() {
    // Ask user for input
    print("Enter the wholesale cost of the item: ")
    val wholesaleCost = readLine()!!.toDouble()

    print("Enter the markup percentage of the item: ")
    val markupPercentage = readLine()!!.toDouble()

    // Calculate retail price using the calculateRetail function
    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)

    // Display the retail price
    println("The item's retail price is: $retailPrice")
}

fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    // Calculate the markup amount
    val markupAmount = wholesaleCost * (markupPercentage / 100)

    // Calculate the retail price
    val retailPrice = wholesaleCost + markupAmount

    // Return the retail price
    return retailPrice
}

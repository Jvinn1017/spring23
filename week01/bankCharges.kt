fun main() {
    val baseFee = 10.0
    val lessThan20Fee = 0.10
    val between20And39Fee = 0.08
    val between40And59Fee = 0.06
    val moreThan60Fee = 0.04
    
    print("Enter the number of checks written for the month: ")
    val numChecks = readLine()?.toInt() ?: 0
    
    var checkFee = when (numChecks) {
        in 1..19 -> numChecks * lessThan20Fee
        in 20..39 -> numChecks * between20And39Fee
        in 40..59 -> numChecks * between40And59Fee
        else -> numChecks * moreThan60Fee
    }
    
    val totalFee = baseFee + checkFee
    
    println("The bank's service fees for the month is $${String.format("%.2f", totalFee)}")
}

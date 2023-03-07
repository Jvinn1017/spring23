fun main() {
    print("Enter the month (in numeric form): ")
    val month = readLine()?.toIntOrNull()
    
    print("Enter the day: ")
    val day = readLine()?.toIntOrNull()
    
    print("Enter the two-digit year: ")
    val year = readLine()?.toIntOrNull()
    
    if (month == null || day == null || year == null) {
        println("Error: Invalid input")
        return
    }
    
    val product = month * day
    
    if (product == year) {
        println("The date is magic!")
    } else {
        println("The date is not magic.")
    }
}

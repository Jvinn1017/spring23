fun main() {
    print("Enter weight in pounds: ")
    val weight = readLine()?.toFloatOrNull()
    
    print("Enter height in inches: ")
    val height = readLine()?.toFloatOrNull()
    
    if (weight == null || height == null || height == 0f) {
        println("Error: Invalid input")
        return
    }
    
    // Calculate the person's BMI using the formula
    val bmi = weight * 703 / height.pow(2)
    
    println("BMI: $bmi")
}

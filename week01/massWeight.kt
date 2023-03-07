fun main() {
    print("Enter the object's mass: ")
    val mass = readLine()?.toFloatOrNull()
    
    if (mass == null) {
        println("Error: Invalid input")
        return
    }
    
    // Calculate the object's weight using the formula
    val weight = mass * 9.8
    
    if (weight > 1000) {
        println("The object is too heavy")
    } else if (weight < 10) {
        println("The object is too light")
    } else {
        println("The object's weight is $weight Newtons")
    }
}

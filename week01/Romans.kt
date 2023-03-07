fun main() {
    print("Enter a number between 1 and 10: ")
    val num = readLine()?.toIntOrNull()
    
    if (num == null || num < 1 || num > 10) {
        println("Error: Invalid input")
        return
    }
    
    val romanNumerals = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X")
    val romanNumeral = romanNumerals[num]
    
    println("$num in Roman numerals is $romanNumeral")
}

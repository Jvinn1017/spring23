fun main() {
    println("Enter a string:")
    val str = readLine() ?: ""
    
    println("Enter a character:")
    val char = readLine()?.getOrNull(0) ?: return
    
    val count = str.count { it == char }
    println("The character '$char' appears $count times in the string '$str'.")
}

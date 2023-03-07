fun main() {
    // Get the three names from the user
    print("Enter the first name: ")
    val name1 = readLine()
    print("Enter the second name: ")
    val name2 = readLine()
    print("Enter the third name: ")
    val name3 = readLine()

    // Sort the names in ascending order using a list and the sorted() function
    val sortedNames = listOf(name1, name2, name3).sorted()

    // Display the sorted names
    println("The names in ascending order are:")
    sortedNames.forEach { println(it) }
}

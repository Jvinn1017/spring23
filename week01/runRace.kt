fun main() {
    // Get the names and times of the three runners from the user
    print("Enter the name of runner 1: ")
    val name1 = readLine()
    print("Enter the time (in minutes) it took runner 1 to finish the race: ")
    val time1 = readLine()?.toIntOrNull()

    print("Enter the name of runner 2: ")
    val name2 = readLine()
    print("Enter the time (in minutes) it took runner 2 to finish the race: ")
    val time2 = readLine()?.toIntOrNull()

    print("Enter the name of runner 3: ")
    val name3 = readLine()
    print("Enter the time (in minutes) it took runner 3 to finish the race: ")
    val time3 = readLine()?.toIntOrNull()

    // Create a map to store the runners' names and times
    val runners = mapOf(
        name1 to time1,
        name2 to time2,
        name3 to time3
    )

    // Sort the runners by their finish times using the map's entries and the sortedBy() function
    val sortedRunners = runners.entries.sortedBy { it.value }

    // Display the names of the runners in the order that they finished
    println("The runners finished in the following order:")
    sortedRunners.forEachIndexed { index, entry ->
        println("${index + 1}. ${entry.key}")
    }
}

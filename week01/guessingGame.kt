import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101) // Generate a random number between 1 and 100
    var guess = 0 // Initialize guess to 0
    var tries = 0 // Initialize tries to 0

    while (guess != secretNumber) {
        print("Guess the number (between 1 and 100): ")
        guess = readLine()?.toIntOrNull() ?: continue // Read user input and convert to Int, or continue if invalid input

        if (guess > secretNumber) {
            println("Too high, try again.")
        } else if (guess < secretNumber) {
            println("Too low, try again.")
        }
        tries++
    }

    println("Congratulations, you guessed the number $secretNumber in $tries tries!")
}

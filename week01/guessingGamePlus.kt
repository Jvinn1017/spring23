fun main() {
    val randomNumber = (1..100).random()
    var guess: Int
    var numOfGuesses = 0

    while (true) {
        guess = readLine()?.toIntOrNull() ?: continue

        if (guess < randomNumber) {
            println("Too low, try again!")
            numOfGuesses++
        } else if (guess > randomNumber) {
            println("Too high, try again!")
            numOfGuesses++
        } else {
            numOfGuesses++
            println("Congratulations! You guessed the number in $numOfGuesses guesses!")
            break
        }
    }
}

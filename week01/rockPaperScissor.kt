

fun getComputerChoice(): String {
    val computerNumber = Random.nextInt(1, 4)
    return when (computerNumber) {
        1 -> "rock"
        2 -> "paper"
        else -> "scissors"
    }
}

fun getUserChoice(): String {
    println("Choose rock, paper, or scissors:")
    return readLine()!!.toLowerCase()
}

fun determineWinner(userChoice: String, computerChoice: String): String {
    return when {
        userChoice == computerChoice -> "tie"
        userChoice == "rock" && computerChoice == "scissors" -> "user"
        userChoice == "scissors" && computerChoice == "paper" -> "user"
        userChoice == "paper" && computerChoice == "rock" -> "user"
        else -> "computer"
    }
}

fun main() {
    val userChoice = getUserChoice()
    val computerChoice = getComputerChoice()
    println("Computer chooses: $computerChoice")
    val winner = determineWinner(userChoice, computerChoice)
    println("Winner: $winner")
}

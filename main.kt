fun main() {
    var guessedCorrect: Boolean = false

    while (!guessedCorrect) {
        println("Enter a guess:")
        val guess = readLine().toString()
        val randomNumber = ((Math.floor(Math.random() * 10)).toInt()).toString();

        if (guess == randomNumber) {
            guessedCorrect = true
            println("You guessed the correct number!")
        } else {
            println("Incorrect guess, the correct number was: $randomNumber")
        }
    }
}
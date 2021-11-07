fun main() {
    var guessedCorrect: Boolean = false;

    while (!guessedCorrect) {
        println("\n\nEnter a guess:");
        val guess: Int = readLine()!!.toInt();
        val newGuess: String;

        if (guess > 10) {
            println("\n\nPlease only guess a number between 1 and 10!")
            continue;
        }
        
        newGuess = guess.toString();

        val randomNumber = (Math.round(Math.random() * 10)).toString();

        if (newGuess == randomNumber) {
            guessedCorrect = true;
            println("\n\nYou guessed the correct number!");
        } else {
            println("\n\nIncorrect guess, the correct number was: $randomNumber");
        }
    }
}
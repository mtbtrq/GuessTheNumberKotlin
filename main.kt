import javax.swing.JOptionPane;

fun main() {
    while (true) {
        val guess = (JOptionPane.showInputDialog(null,"Enter a guess:")).toInt();
        val newGuess: String;

        if (guess > 10) {
            JOptionPane.showMessageDialog(null, "Please only guess a number between 1 and 10!")
            continue;
        }
        
        newGuess = guess.toString();

        var randomNumber = (Math.round(Math.random() * 11)).toString();

        if (randomNumber == "0") {
            randomNumber = "1";
        }

        if (newGuess == randomNumber) {
            JOptionPane.showMessageDialog(null, "You guessed the correct number!")
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect guess, the correct number was: $randomNumber")
        }
    }
}
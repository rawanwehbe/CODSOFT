public class GameReporter {
    public void welcomeUser() {
        System.out.println("welcome to number guessing game!");
    }

    public void breakLine() {
        System.out.println("--------------------------------");
    }

    public void markAttempt(int attempt, int maxAttempt) {
        System.out.println("this attempt is: " + (attempt) + " out of " + maxAttempt);
    }

    public void askForNumberGuess(int min, int max) {
        System.out.println("Guess a number between " + min + " and " + max + ": ");
    }

    public void correctAnswer() {
        System.out.println("Bravo! correct guess.");
    }

    public void wrongAnswer(String level) {
        System.out.println("your guess is too " + level + "! Try again");
    }

    public void reachedMax() {
        System.out.println("You've reached the maximum number of attempts");
    }

    public void askForPlayAgain() {
        System.out.println("Do you want to play again?(yes/no)");
    }

    public void finalResult(int roundsWon) {
        System.out.println("Total rounds won: " + roundsWon);

    }

}

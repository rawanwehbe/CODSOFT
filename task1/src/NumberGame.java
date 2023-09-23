import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static final int MAX_ATTEMPTS = 12;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;

    private GameReporter gameReporter;
    private Scanner scanner;
    private boolean playAgain;
    private int roundsWon;

    public NumberGame(GameReporter gameReporter) {
        this.gameReporter = gameReporter;
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        welcomeUser();

        initGame();

        runGame();

        closeGame();
    }

    private void closeGame() {
        gameReporter.finalResult(roundsWon);
        scanner.close();
    }

    private void runGame() {
        while (playAgain) {

            int randomNumber = getRandomNumber();

            runningUserAttempts(randomNumber);

            gameReporter.askForPlayAgain();
            checkPlayAgain();
        }
    }

    private void runningUserAttempts(int randomNumber) {
        for (int attempt = 0; attempt < MAX_ATTEMPTS; attempt++) {
            gameReporter.markAttempt(attempt, MAX_ATTEMPTS);
            gameReporter.askForNumberGuess(MIN_NUMBER, MAX_NUMBER);

            if (isUserGuessCorrect(randomNumber)) {
                break;
            }

            checkGameEnded(attempt);
        }
    }

    private void checkPlayAgain() {
        String response = scanner.next().toLowerCase();
        playAgain = response.equals("yes");
    }

    private boolean isUserGuessCorrect(int randomNumber) {
        int userGuess = scanner.nextInt();
        gameReporter.breakLine();

        if (userGuess == randomNumber) {
            gameReporter.correctAnswer();
            roundsWon++;
            return true;
        } else if (userGuess < randomNumber) {
            gameReporter.wrongAnswer("low");
        } else {
            gameReporter.wrongAnswer("high");
        }
        return false;
    }

    private void checkGameEnded(int attempt) {
        if (attempt == MAX_ATTEMPTS) {
            gameReporter.reachedMax();
        }
    }

    private static int getRandomNumber() {
        return new Random().nextInt((MAX_NUMBER)) + MIN_NUMBER;
    }

    private void initGame() {
        playAgain = true;
        roundsWon = 0;
    }

    private void welcomeUser() {
        gameReporter.welcomeUser();
        gameReporter.breakLine();
    }
}

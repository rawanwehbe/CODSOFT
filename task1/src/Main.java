
public class Main {
    public static void main(String[] args) {
        GameReporter gameReporter = new GameReporter();
        NumberGame numberGame = new NumberGame(gameReporter);
        numberGame.startGame();

    }
}
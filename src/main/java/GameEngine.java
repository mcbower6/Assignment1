public class GameEngine {
    private final int min;
    private final int max;
    private int target;
    private int attempts;
    private boolean gameWon;
<<<<<<< HEAD
    private boolean userQuit;
=======
    private boolean hintsEnabled;
>>>>>>> f1097b6 (started hint)

    public GameEngine(int min, int max) {
        this.min = min;
        this.max = max;
        this.attempts = 0;
        this.gameWon = false;
<<<<<<< HEAD
        this.userQuit = false;
=======
        this.hintsEnabled = true;
>>>>>>> f1097b6 (started hint)
        reset();
    }

    public GuessResult makeGuess(int guess) {
        // Check if user wants to quit (negative number)
        if (guess < 0) {
            userQuit = true;
            return new GuessResult(false, "Exiting game...", attempts);
        }

        attempts++;

        if (guess == target) {
            gameWon = true;
            return new GuessResult(true, "Correct! You guessed it in " + attempts + " attempts.", attempts);
        } else if (guess < target) {
            return new GuessResult(false, "Too low! Try a higher number.", attempts);
        } else {
            return new GuessResult(false, "Too high! Try a lower number.", attempts);
        }
    }

    public void reset() {
        target = Utils.randomInt(min, max);
        attempts = 0;
        gameWon = false;
        userQuit = false;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public boolean hasUserQuit() {
        return userQuit;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    // For testing purposes only
    protected void setTarget(int target) {
        this.target = target;
    }

    protected int getTarget() {
        return target;
    }
}

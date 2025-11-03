package core.basesyntax;

import java.util.Random;

/**
 * Lottery that generates random Ball instances.
 */
public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    /**
     * Creates and returns a Ball with a random color and a random number
     * in the range 0..100 (inclusive).
     *
     * @return a randomly generated Ball
     */
    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER + 1); // 0..100 inclusive
        Colors randomColor = colorSupplier.getRandomColor();
        return new Ball(randomNumber, randomColor);
    }
}

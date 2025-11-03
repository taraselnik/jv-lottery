package core.basesyntax;

import java.util.Random;

/**
 * Supplies random Colors.
 */
public class ColorSupplier {
    private final Random random = new Random();

    /**
     * Returns a random Colors value chosen from the enum.
     *
     * @return a random Colors value
     */
    public Colors getRandomColor() {
        int indexColor = random.nextInt(Colors.values().length);
        return Colors.values()[indexColor];
    }
}

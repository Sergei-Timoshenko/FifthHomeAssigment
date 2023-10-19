package part_six.utils;

import java.util.Random;

public class UnitUtils {
    private static final Random random = new Random(System.nanoTime());

    public static Double getRandomDamageMultiplier() {
        return random.nextDouble();
    }

    public static Integer getRandomDuelistToRemove(Integer number) {
        return random.nextInt(number);
    }
}

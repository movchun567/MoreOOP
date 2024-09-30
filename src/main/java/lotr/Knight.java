package lotr;

import lotr.kickstrat.KnightKick;
import java.util.Random;

public class Knight extends Character {
    private static Random random = new Random();
    public Knight() {
        super(2 + random.nextInt(11), 2 + random.nextInt(11), new KnightKick());
    }
}

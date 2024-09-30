package lotr;

import lotr.kickstrat.KingKick;
import java.util.Random;

public class King extends Character {
    private static Random random = new Random();
    public King() {
        super(5 + random.nextInt(11), 5 + random.nextInt(11), new KingKick());
    }
    
}

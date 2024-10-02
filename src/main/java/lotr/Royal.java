package lotr;

import java.util.Random;
import lotr.kickstrat.RoyalKick;
import lotr.kickstrat.KickStrategy;

abstract public class Royal extends Character {
    private static Random random = new Random();

    public Royal(int minPower, int maxPower, int minHp, int maxHp, KickStrategy kickStrategy) {
        super(random.nextInt(maxPower - minPower) + minPower, random.nextInt(maxHp - minHp) + minHp, new RoyalKick());
    }


}

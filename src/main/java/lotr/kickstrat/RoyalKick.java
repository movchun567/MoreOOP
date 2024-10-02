package lotr.kickstrat;

import lotr.Character;
import java.util.Random;

public class RoyalKick implements KickStrategy {
    private static Random random = new Random();

    @Override
    public void kick(Character kicker, Character target) {
        int damage = 1 + random.nextInt(kicker.getPower());
        target.setHp(target.getHp() - damage);
    }
    
}
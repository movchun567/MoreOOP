package lotr.kickstrat;

import lotr.Character;

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character kicker, Character target) {
        if (target.getPower() < kicker.getPower()) {
            target.setHp(0);
        } else {
            target.setPower(target.getPower() - 1);
        }
    }
    
}

package lotr.kickstrat;

import lotr.Character;

public class HobbitKick implements KickStrategy {
    @Override
    public void kick(Character kicker, Character target) {
        System.out.println(":(");
    }
    
}

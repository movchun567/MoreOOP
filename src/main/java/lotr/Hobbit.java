package lotr;

import lotr.kickstrat.HobbitKick;

public class Hobbit extends Character {
    
    public Hobbit() {
        super(0, 3, new HobbitKick());
    }
}

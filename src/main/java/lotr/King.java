package lotr;

import lotr.kickstrat.RoyalKick;

public class King extends Royal {
    public King() {
        super(5, 15, 5, 15, new RoyalKick());
    }
    
}

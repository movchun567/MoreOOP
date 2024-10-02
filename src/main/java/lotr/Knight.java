package lotr;

import lotr.kickstrat.RoyalKick;

public class Knight extends Royal {
    public Knight() {
        super(2, 12, 2, 12, new RoyalKick());
    }
}

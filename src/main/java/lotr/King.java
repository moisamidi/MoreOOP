package lotr;

import kick.KingKick;
import java.util.Random;

public class King extends Character {
    private Random randomizer = new Random();

    public King() {
        super(new KingKick());
        setHp(randomizer.nextInt(11) + 5);
        setPower(randomizer.nextInt(11) + 5);
    }
}





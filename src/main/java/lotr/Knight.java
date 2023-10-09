package lotr;
import kick.KingKick;
import java.util.Random;

public class Knight extends Character{
    private Random randomizer = new Random();

    public Knight() {
        super(new KingKick());
            Random randomizer = new Random();
            this.power = randomizer.nextInt(11) + 2;
            this.hp = randomizer.nextInt(11) + 2;
        }
    }
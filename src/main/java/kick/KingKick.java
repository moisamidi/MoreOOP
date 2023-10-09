package kick;
import lotr.Character;
import java.util.Random;
    public class KingKick implements Kick{
        Random rand = new Random();
        @Override
        public void kick(Character attacker, Character defeated) {
            int damage = rand.nextInt(attacker.getPower() + 1);
            defeated.setHp(defeated.getHp() - damage);
        }
    }
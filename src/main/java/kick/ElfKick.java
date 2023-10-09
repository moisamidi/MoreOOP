package kick;
import lotr.Character;

public class ElfKick implements Kick{
    @Override
    public void kick(Character attacker, Character defeated) {
        if (attacker.getPower() > defeated.getPower()) {
            defeated.setHp(0);
        } else {
            defeated.setHp(defeated.getHp() - 1);
        }
    }
}
package kick;
import lotr.Character;

public class toCry implements Kick{
    @Override
    public void kick(Character attacker, Character defeated) {
        System.out.println("You are crying like baby!");
    }

    }
package lotr;

//import kick.ElfKick;
import kick.ElfKick;
import kick.Kick;
import kick.KingKick;
import kick.toCry;
import lombok.Data;
import lombok.Getter;

@Data
public class Character {
    @Getter
    protected int power;
    @Getter
    protected int hp;
    private Kick kicking;

    public Character(toCry toCry) {
    }

    //
//    public Character(Kick kicking) {
//        this.kicking = kicking;
//    }

    public void attack(Character c) {
    }

    public Character(ElfKick elfKick) {
    }

    public Character(KingKick kingKick) {
    }

    public Character(int i, int i1) {
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if (!this.isAlive()) {
            this.hp = 0;
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }

    public void kick(Character c) {
        if (this.getPower() > c.getPower()) {
            c.setHp(0);
        } else {
            c.setHp(c.getHp() - 1);
        }
    }
}
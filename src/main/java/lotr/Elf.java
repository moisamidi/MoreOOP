package lotr;
import kick.ElfKick;
import lombok.Getter;
@Getter
public class Elf extends Character {
    public Elf() {
        super(new ElfKick());
        setPower(10);
        setHp(10);
    }
    }


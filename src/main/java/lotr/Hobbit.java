package lotr;

import kick.toCry;
import lombok.Getter;
@Getter
public class Hobbit extends Character{
    public Hobbit(){
        super(new toCry());
        setPower(0);
        setHp(3);
    }
}

package lotr;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("Battle begins!");
        System.out.println(c1.getClass().getSimpleName() + " vs " + c2.getClass().getSimpleName());
        System.out.println("Let the fight commence!");

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("------------------------------------------------");
            System.out.println(c1.getClass().getSimpleName() + " attacks first" + c2.getClass().getSimpleName() + "!");
            c1.attack(c2);
            System.out.println(c2.getClass().getSimpleName() + "'s HP: " + c2.getHp());
            System.out.println("-------------------------------------------------");

            if (!c2.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " is WINNERRRRRRR!");
                break;
            }

            System.out.println(c2.getClass().getSimpleName() + " kick him " + c1.getClass().getSimpleName() + "!");
            c2.attack(c1);
            System.out.println(c1.getClass().getSimpleName() + "'s HP: " + c1.getHp());
            System.out.println("-------------------------------------------------");

            if (!c1.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " is victorious!");
                break;
            }
        }

        System.out.println("THE END");
    }
}

package lotr;

import java.util.Random;

enum CharacterType {
    HOBBIT,
    ELF,
    KING,
    KNIGHT
}

public class CharacterFactory {
    public static Character createCharacter() {
        CharacterType[] possibleCharacterTypes = CharacterType.values();
        int randomIndex = new Random().nextInt(possibleCharacterTypes.length);

        Character createdCharacter = null;
        switch (possibleCharacterTypes[randomIndex]) {
            case HOBBIT:
                createdCharacter = new Hobbit();
                break;
            case ELF:
                createdCharacter = new Elf();
                break;
            case KING:
                createdCharacter = new King();
                break;
            case KNIGHT:
                createdCharacter = new Knight();
                break;
        }

        return createdCharacter;
    }
}

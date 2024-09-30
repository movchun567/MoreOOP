package lotr;

import java.util.Random;

public class CharacterFactory {
    private static final Random random = new Random();

    public Character createCharacter() {
        int randomInt = random.nextInt(4);
        switch (randomInt) {
            case 0:
                return new Elf();
            case 1:
                return new Hobbit();
            case 2:
                return new King();
            case 3:
                return new Knight();
            default:
                return null;
        }
    }
}

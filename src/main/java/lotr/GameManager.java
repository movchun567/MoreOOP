package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("A fight is happening between " + c1 + " and " + c2);
        
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);

            System.out.println(c1 + " is kicking " + c2 + "!");
            System.out.println(c2 + " hp is " + c2.getHp());

            if (!c2.isAlive()) {
                System.out.println(c2 + " is dead!");
                break;
            }

            c2.kick(c1);

            System.out.println(c2 + " is kicking " + c1 + "!");
            System.out.println(c1 + " hp is " + c1.getHp());

            if (!c1.isAlive()) {
                System.out.println(c1 + " is dead!");
                break;
            }

        }
        if (c1.isAlive()) {
            System.out.println(c1 + " wins!");
        } else {
            System.out.println(c2 + " wins!");
        }
    }

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        GameManager gameManager = new GameManager();

        Character c1 = characterFactory.createCharacter();
        Character c2 = characterFactory.createCharacter();

        gameManager.fight(c1, c2);
    }
}

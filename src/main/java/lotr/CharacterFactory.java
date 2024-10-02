package lotr;

import org.reflections.Reflections;
import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import java.util.Random;
import java.util.ArrayList;

public class CharacterFactory {
    private static final Random random = new Random();

    public Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        ArrayList<Class<? extends Character>> characterClasses = new ArrayList<>(reflections.getSubTypesOf(Character.class));
        characterClasses.removeIf(characterClass -> Modifier.isAbstract(characterClass.getModifiers()));
        Random random = new Random();
        int randomIndex = random.nextInt(characterClasses.size());
        try {
            Constructor<? extends Character> constructor = characterClasses.get(randomIndex).getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}

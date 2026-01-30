import java.util.Random;

public class TextProvider {

    private static final String[] TEXTS = {
        "Java is a popular object oriented programming language.",
        "Consistency is the key to mastering programming skills.",
        "Typing speed improves with daily practice."
    };

    public static String getRandomText() {
        Random random = new Random();
        int index = random.nextInt(TEXTS.length);
        return TEXTS[index];
    }
}

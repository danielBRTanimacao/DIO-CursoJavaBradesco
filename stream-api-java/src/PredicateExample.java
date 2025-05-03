import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "Django");

        Predicate<String> twoCharacters = word -> word.length() > 2;

        words.stream().filter(twoCharacters).forEach(System.out::println);
    }
}

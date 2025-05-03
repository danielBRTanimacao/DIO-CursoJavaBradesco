import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        Function<Integer, Integer> _double = num -> num * 2;

        List<Integer> doubleNumbers = numbers.stream()
            .map(_double)
            .collect(Collectors.toList());

        doubleNumbers.forEach(n -> System.out.println(n));
    }
}
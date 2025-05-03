import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> printNums = nums -> {
            if (nums % 2 == 0) {
                System.out.println(nums);
            }
        };

        numbers.stream().forEach(printNums);
    }
}

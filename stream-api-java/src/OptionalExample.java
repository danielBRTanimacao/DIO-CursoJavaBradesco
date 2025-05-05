import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        /*
        // of(value)
        Optional<String> optValue = Optional.of("Olá");
        System.out.println(optValue.get());

        String nullableValue = null; // OfNullable(value)
        Optional<String> optionalValue = Optional.ofNullable(nullableValue);
        System.out.println(optionalValue.isPresent());

        // empty()
        Optional<String> optionalValue = Optional.empty();
        System.out.println(optionalValue.isPresent());

        // isPresent()
        Optional<String> optionalValue = Optional.of("Olaa!");
        System.out.println(optionalValue.isPresent());
         */

        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseThrow(() -> new RuntimeException("Valor não esta presente!"));
    }
}

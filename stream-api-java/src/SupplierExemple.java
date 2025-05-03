import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemple {
    public static void main(String[] args) {
        Supplier<String> hellos = () -> "Olá, Mundo!";
        
        List<String> listHellos = Stream.generate(hellos)
            .limit(5)
            .collect(Collectors.toList());

        listHellos.forEach(str -> System.out.println(str));
    }
}

import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws Exception {
        List<User> listOfUsers = List.of(
            new User("Bico seco", 29, 60.0), 
            new User("Cururu", 90, 122.1)
        );

        listOfUsers.forEach((User user) -> {
            System.out.println(user);
        }); // Lambda interface funcional
        
        // listOfUsers.forEach((User user) -> System.out.println(user));
        
        /*var consum = new Consumer<User>() {

            @Override
            public void accept(final User user) {
                System.out.println(user);
            }
        };
        listOfUsers.forEach(consum);*/
    }
}

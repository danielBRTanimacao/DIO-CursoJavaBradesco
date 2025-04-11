public class App {
    public static void main(String[] args) {
        var male = new Person("Bababui", "123.456.789.10", 26);
        var female = new Person("Bababua", "123.456.789.10", 24);
        
        System.out.println("Male name: " + male.getName() + "\nIdade: " + male.getAge());
        System.out.println("Female name: " + female.getName() + "\nIdade: " + female.getAge());
    }
}

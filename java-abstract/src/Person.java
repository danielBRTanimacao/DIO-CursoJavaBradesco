public class Person {
    private String name;
    private final String CPF;
    private int age;

    public Person(String name, String cpf, int age) {
        this.name = name;
        this.CPF = cpf;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return CPF;
    }

    public int getAge() {
        return age;
    }
}

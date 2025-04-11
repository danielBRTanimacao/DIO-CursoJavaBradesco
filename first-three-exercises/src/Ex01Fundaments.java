public class Ex01Fundaments {
    public static void main(String[] args) {
        helloAnyone("Daniel", 20);
        calcAreaSq(5, 10);
        calcAreaTri(10, 3.2);
    }

    public static void helloAnyone(String name, int age) {
        System.out.println("Olá " + name + " você tem " + age + " anos");
    }

    public static void calcAreaSq(double face, double otherFace) {
        System.out.println("A area do quadrado é: " + (face * otherFace));
    }

    public static void calcAreaTri(double base, double height) {
        System.out.println("A area do triangulo é: " + (base * height));
    }
}

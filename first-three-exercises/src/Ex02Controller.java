import exceptions.ParameterInvalidExceptions;

public class Ex02Controller {
    public static void main(String[] args) throws ParameterInvalidExceptions {
        // multiTable(5);
        // double myIMC = calcIMC(54.2, 1.85);
        // System.out.println("Seu IMC: " + String.format("%.1f", myIMC));
        // showTableIMC(myIMC);
        // numbersList(1, 10, "par");
        // numbersList(1, 10, "impar");
    }

    public static void multiTable(int num) {
        for (int i = 0; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static double calcIMC(double weight, double height) {
        return weight / (height * height);
    }

    public static void showTableIMC(double imc) {
        System.out.println(
            "Se for menor ou igual a 18,5 \n" +
            "se for entre 18,6 e 24,9 \n" +
            "Se for entre 25,0 e 29,9 \n" +
            "Se for entre 30,0 e 34,9 \n" +
            "Se for entre 35,0 e 39,9 \n" +
            "Se for maior ou igual a 40,0");

        if (imc <= 18.5){
            System.out.println("Você esta " + "Abaixo do peso " + "IMC " + String.format("%.1f", imc));
        }
        else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Você esta " + "Peso ideal " + "IMC " + String.format("%.1f", imc));
        }
        else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Você esta " + "Levemente acima do peso " + "IMC " + String.format("%.1f", imc));
        }
        else if (imc > 29.9 && imc <= 34.9) {
            System.out.println("Você esta " + "Obesidade Grau I " + "IMC " + String.format("%.1f", imc));
        }
        else if (imc > 34.9 && imc <= 39.9) {
            System.out.println("Você esta " + "Obesidade Grau II (Severa) " + "IMC " + String.format("%.1f", imc));
        }
        else if (imc >= 40) {
            System.out.println("Você esta " + "Obesidade III (Mórbida) " + "IMC " + String.format("%.1f", imc));
        }
    }

    public static void numbersList(int n1, int n2, String choose) throws ParameterInvalidExceptions {
        if (n1 >= n2) {
            throw new ParameterInvalidExceptions("Segundo parametro deve ser maior que o primeiro");
        }

        if (choose == "par") {
            for (int i = n1; i < n2+1; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = n1; i < n2+1; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de IMC");
        System.out.println("Digite seu peso [Kg] ");
        System.out.print("> ");
        int peso = sc.nextInt();

        System.out.println("Digite sua altura [m] ");
        System.out.print("> ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC = %.2f",  imc);





        sc.close();
    }
}

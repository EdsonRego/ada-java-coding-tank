import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Par ou Impar");
        System.out.print("Digite um número: ");
        double numero = sc.nextInt();

        double resto = numero % 2 ;

        if(resto == 0){
            System.out.println("O número " + numero + " é par.");
        }else {
            System.out.println("O número " + numero + " é impar.");
        }

        sc.close();
    }
}

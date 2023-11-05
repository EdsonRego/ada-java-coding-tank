import java.util.Scanner;

public class OperacoesBasicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, qual é o seu nome?");
        System.out.println("> ");
        String nome = leitor.next();
        System.out.println("Olá, boa noite = " + nome);

        leitor.close();
    }
}

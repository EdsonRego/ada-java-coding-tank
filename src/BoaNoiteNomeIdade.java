import java.util.Scanner;

public class BoaNoiteNomeIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, qual é o seu nome?");
        System.out.println("> ");
        String nome = leitor.next();
        System.out.println("Olá, boa noite = " + nome);

        System.out.println("Que ano você nasceu?");
        System.out.println("> ");
        int ano = leitor.nextInt();
        int idade = 2023 - ano;
        System.out.println("Olá, boa noite = " + idade);

        leitor.close();

    }
}

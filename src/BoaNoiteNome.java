import java.util.Scanner;

public class BoaNoiteNome {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Olá, qual é o seu nome? ");
            System.out.print("> ");
            String nome = leitor.next();

            System.out.println("Olá, boa noite = " + nome);

            System.out.println("Olá, qual a sua idade?");
            System.out.print("> ");
            int idade = leitor.nextInt();
            System.out.println("Que legal, você tem = " + idade + " de idade!");

            System.out.println("Deseja continuar [s/n]");
            System.out.print("> ");
            String opcao = leitor.next();

            if(opcao.equals("n")){
                continuar = false;
            }
        }

        leitor.close();

    }
}

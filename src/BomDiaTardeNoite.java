import java.util.Scanner;

public class BomDiaTardeNoite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.next();
        System.out.print("Digite a hora: ");
        int hora = sc.nextInt();

        if (hora > 4 && hora < 11) {
            System.out.println("Bom dia! " + nome);
        } else if (hora > 12 && hora < 17) {
            System.out.println("Boa tarde! " + nome);
        } else if (hora > 18 && hora < 23 || hora > 0 && hora < 3 ) {
            System.out.println("Boa noite! " + nome);
        } else if (hora > 23 || hora < 0 ) {
            System.out.println("Inválido ");
        }else {
            System.out.println("valor inválido");
        }
    }
}

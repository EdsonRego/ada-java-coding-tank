import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double media = sc.nextDouble();

        if(media >= 9.0 ){
            System.out.println("A");
        } else if (media >= 8.0) {
            System.out.println("B");
        } else if (media >= 7.0) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }
        sc.close();
    }
}

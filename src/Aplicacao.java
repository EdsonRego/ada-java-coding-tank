public class Aplicacao {
    public static void main(String[] args) {

        //System.out.printf("Hola, %s", args[0]);

//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        for (int item : numbers) {
//            System.out.println("Count is: " + item);

            char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};

            char[] copyTo = java.util.Arrays.copyOfRange(copyFrom,2,9);
            System.out.println(new String(copyTo));
        }
}

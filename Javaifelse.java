public class Javaifelse {
    public static void main(String[] args) {

        /* Possiveis entradas
         * x < y
         * x <= y
         * x > y
         * x >= y
         * x == y
         * x != y
         * if (condição){
         * }
         * */

        int x = 20;
        int y = 10;

        if (x > y) {
            System.out.println("O número " + x + " é maior que: " + y);
        }

        int num = 25;

        if (num > 30) {
            System.out.println("Número maior que 30");
        } else {
            System.out.println("Número menor que 30");
        }

        int horario = 21;

        if (horario <= 12) {
            System.out.println("Bom dia!");
        } else if (horario <= 19) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }

    }
}

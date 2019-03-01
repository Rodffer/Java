import java.util.Scanner;

public class JavaSwitchCase {

    public static void main(String[] args) {

        /* Utilizado para selecionar entre algumas opções
        EXEMPLO: DIGITAR 2 NUMEROS E ESCOLHER A OPERAÇÃO MATEMATICA
        */
        int x = 0, y = 0, z = 0;
        System.out.println("Digite o primeiro Numero: ");
        y = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Digite o segundo Numero: ");
        z = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println("ESCOLHA\nDigite 1 para: Somar\nDigite 2 para: Dividir\nDigite 3 para: Multiplicar \nDigite 4 para: Subtrair\n");
        x = Integer.parseInt(new Scanner(System.in).nextLine());

        switch (x) {
            case 1:
                System.out.println("Resultado: " + (y + z));
                break;

            case 2:
                System.out.println("Resultado: " + (y / z));
                break;

            case 3:
                System.out.println("Resultado: " + (y * z));
                break;

            case 4:
                System.out.println("Resultado: " + (y - z));
                break;

        }
    }

}

public class strings {

    public static void main(String[] args) {

        /*Exemplo de uma variavel String*/
        String variavel = "Variavel do tipo String";

        /*Para colocar aspas dentro da String utilize aspas simples.*/
        String texto = "Colocando 'aspas' dentro da String";
        System.out.println(texto);

        /* metodo length para retornar quantos caracteres estão dentro da String. */
        String txt = "Contando quantos caracteres tem essa String.";
        int len = txt.length();
        System.out.println("Essa String possui :" + len + " caracteres.");

        String txt02 = "Trabalhando com Java.";
        System.out.println(txt02.toUpperCase()); // Imprime a String em caixa alta.
        System.out.println(txt02.toLowerCase()); // Imprime a String em caixa baixa.

        /*CONCATENAÇÃO*/
        String primeiroNome = "José ";
        String segundoNome = "Silva";
        System.out.println(primeiroNome + segundoNome); //Utilizando operador +

        System.out.println(primeiroNome.concat(segundoNome)); //Utilizando Metodo concat()

        //Com Números
        int x = 10;
        int y = 20;
        System.out.println(x + y); //Somando x + y, declarando eles como int

        String a = "10";
        String b = "20";
        System.out.println(a + b); //Concatenando a + b, declarando eles como String
    }
}

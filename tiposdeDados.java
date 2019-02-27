package gitJavaRod;

public class tiposdeDados {
	
	public static void main(String[] args) {
		
		int tipoNumero = 10; 				// Números Inteiros;
		double tipoNumeroflutuante = 10.99; // Números com casas decimais;
		char tipoLetra = 'A';				// Apenas caracteres;
		boolean tipoBollean = true;			// Apenas dois valores Verdadeiro ou Falso;
		String tipoTexto = "Olá, Mundo!";	//String de textos, toda string será reconhecida como texto;
		
		
		//INTEIROS
		
		/*O Byte pode ser utilizado para armazenar números inteiros entre -128 a 127. Poupando memória quando se tem certeza
		do número que será utilizado.*/
		byte tipobyte = 100;
			System.out.println(tipobyte);
		
		//O short pode armazenar números inteiros de -32768 a 32767.
		short tipoShort = 5000;
			System.out.println(tipoShort);
		
		/*O int pode armazenar números inteiros de -2147483648 a 2147483647
		e é o mais utilizado.*/
		int tipoInt = 20000;
			System.out.println(tipoInt);
		
		/*O tipo long pode armazenar números inteiros de -9223372036854775808 a 9223372036854775808
		 * Ele é utilizado quando o int não consegue armazenar o valor grande. Deve-se colocar um "L" no final do número.*/
		long tipoLong = 17000000000L; 
			System.out.println(tipoLong);
		
		//FLUTUANTES
		
		//O tipo float armazena números fracionários de 3.4e - 038 a 3.4e +038, o valor deve terminar com um f.
		float tipoFloat = 6.66f;
			System.out.println(tipoFloat);
			
		//O tipo double armazena números fracionais de 1.7e - 308 a 1.7e +038.
		double tipoDouble = 7.77;
			System.out.println(tipoDouble);
		
		// NÚMEROS CIENTÍFICOS
			
		//O ponto flutuante pode ser um número científico com um "e" indicando a potência de 10.
		float f1 = 35e3f;
		double d1 = 12E4d;
			System.out.println(f1);
			System.out.println(d1);
		
		//O bolean só pode receber valores verdadeiro ou falso.
		boolean tipoJavaLegal = true;
		boolean tipoJavaPesado = false;
			System.out.println(tipoJavaLegal);
			System.out.println(tipoJavaPesado);
		
		//STRINGS
		
		//O tipo char armazena um unico caractere e deve ficar entre aspas simples.
		char tipoChar = 'A';
			System.out.println(tipoChar);
		
		//O tipo String armazena uma sequencia de caracteres e deve ficar entre aspas duplas.
		String tipoString = "Isso é uma String";
			System.out.println(tipoString);
			
	}

}

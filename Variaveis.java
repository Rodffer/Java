package gitJavaRod;

public class Variaveis {

	/* String -> Armazena textos deve ser colocado em "aspas duplas"
	 * int -> armazena n�meros inteiros, sem casa decimal, ex: 123, -123
	 * double -> armazena n�meros flutuantes, ou seja numeros com "." ex: 20,05
	 * char -> armazena caracteres �nicos e devem conter 'aspas simples' ex: 'a'  'B'
	 * boolean -> armazena valores com dois estados ou seja Verdadeiro ou Falso ex: True  False
	 * EXEMPLOS A SEGUIR 
	 */
	
	public static void main(String[] args) {
		//STRING
		String nome = "Maria";
			System.out.println("V�riavel do tipo String: " + nome);
		//INT
		int numero = 1977;
			System.out.println("V�riavel do tipo int: " + numero);
		//DOUBLE
		double numflutuante = 10.99;
			System.out.println("V�riavel do tipo double: " + numflutuante);
		//CHAR
		char tipoLetra = 'A';
			System.out.println("V�riavel do tipo char: " + tipoLetra);
		//BOLEAN
		boolean tipoF = false;
			System.out.println("V�riavel do tipo boolean: " + tipoF);
			
		// Juntando duas V�riaveis do tipo String
			//Modelo01
		String primeironome = "Jo�o ";
		String sobrenome = "Silva";
			System.out.println("Nome completo: " + primeironome + sobrenome);
			//Modelo02
		String primeironome2 = "Marco ";
		String sobrenome2 = "Santos";
		String nomecompleto = primeironome2+sobrenome2;
				System.out.println("Nome completo: " + nomecompleto);
		
		// Juntando duas V�riaveis do tipo int
		
		int x = 10;
		int y = 5;
		
		System.out.println(x+y);
		
		// Declarar mais de uma v�riavel
		
		int a = 1, b = 2, c = 3;
		System.out.println(a + b + c);
	}
}

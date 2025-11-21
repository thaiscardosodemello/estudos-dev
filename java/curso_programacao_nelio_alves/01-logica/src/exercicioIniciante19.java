import java.util.Scanner;

public class exercicioIniciante19 {

	public static void main(String[] args) {
		// EXERCÍCIO 2 - Estrutura Repetitiva (for)
		//OK Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
		// mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo,
		// e "out" para fora do intervalo).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de valores inteiro que serão lidos:");
		int n = sc.nextInt(); 
		
		// fora do FOR lê apenas um valor
		// System.out.println("Digite um número:");
		// int x = sc.nextInt();		
		for ( int i = 0; i < n ; i++) { 
			// dentro do for lê + de 1 valor
			System.out.println("Digite um número:");
			int x = sc.nextInt();
			
			if ( 10 < x && x < 20 ) {
				System.out.println(x + " in".toUpperCase());
			}
			else {
				System.out.println(x + " out".toUpperCase());
			}
		}
		sc.close();
	}

}

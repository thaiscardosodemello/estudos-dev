import java.util.Scanner;

public class exercicioIniciante08 {

	public static void main(String[] args) {
		// EXERCÍCIO 8
		// Fazer um programa para ler um número inteiro
		// e dizer se este número é par ou ímpar
		
		Scanner sc = new Scanner(System.in);
		
		int num,calc;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		calc = num % 2;
				
		if ( calc == 0 ) {
			System.out.printf("O número %d é PAR!", num);
		}
		else {
			System.out.printf("O número %d é ÍMPAR!", num);
		}
			
		sc.close();
	}

}

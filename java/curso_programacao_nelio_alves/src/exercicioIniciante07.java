import java.util.Scanner;

public class exercicioIniciante07 {

	public static void main(String[] args) {
		// EXERCÍCIO 7
		// Fazer um programa para ler (Scanner) um número inteiro (int num), e
		// depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número (positivo ou negativo): ");
		num = sc.nextInt();
		
		if ( num < 0 ) {
			System.out.printf("O número %d é NEGATIVO!", num);
		} else {
			System.out.printf("O número %d é NÃO NEGATIVO!", num);
		}
		
		sc.close();
	}
}

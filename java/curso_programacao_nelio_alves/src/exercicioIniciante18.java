import java.util.Scanner;

public class exercicioIniciante18 {

	public static void main(String[] args) {
		// EXERCÍCIO 1 - Estrutura Repetitiva (for)
		// Leia um valor inteiro X (1 <= X <= 1000).
		// Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		int x = sc.nextInt();
		
		for ( int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}

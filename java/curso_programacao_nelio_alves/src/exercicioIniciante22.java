import java.util.Scanner;

public class exercicioIniciante22 {

	public static void main(String[] args) {
		// EXERCÍCIO 5 - Estrutura Repetitiva (for)
		// Ler um valor N.
		// Calcular e escrever seu respectivo fatorial.
		// Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		// *Lembrando que, por definição, fatorial de 0 é 1. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		int fatorial = 1; // funciona como um acumulador
				
		for (int i = 1; i <= n; i++) {
			// O fatorial é o produto de todos os inteiros positivos de 1 até n.
		    // Por isso o contador começa em 1: se começasse em 0, o resultado seria sempre 0,
		    // já que qualquer número multiplicado por 0 é 0.
			fatorial = fatorial * i;
		}
		
		System.out.println("Fatorial de " + n + " = " + fatorial);
		
		sc.close();

	}

}

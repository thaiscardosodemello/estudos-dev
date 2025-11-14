import java.util.Scanner;

public class exercicioIniciante21 {

	public static void main(String[] args) {
		// EXERCÍCIO 4 - Estrutura Repetitiva (for)
		// Fazer um programa para ler um número N.
		// Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
		// Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n ; i++ ) {
			
			System.out.println("Insira o primeiro número para a leitura do par: ");
			int x = sc.nextInt();
			System.out.println("Insira o segundo número para a leitura do par: ");
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel!".toUpperCase());
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
	}

}

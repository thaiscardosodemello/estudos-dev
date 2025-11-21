import java.util.Scanner;

public class exercicioIniciante20 {

	public static void main(String[] args) {
		// EXERCÍCIO 3 - Estrutura Repetitiva (for)
		// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
		// Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
		// Apresente a média ponderada para cada um destes conjuntos de 3 valores,
		// sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem	peso 5.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número de casos de teste:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Insira o valor 1:");
			double a = sc.nextDouble();
			System.out.println("Insira o valor 2:");
			double b = sc.nextDouble();
			System.out.println("Insira o valor 3:");
			double c = sc.nextDouble();
			
			double media = ( a * 2 + b * 3 + c * 5 ) / 10;
			
			System.out.printf("A média dos 3 valores é de: %.1f%n", media);
		}
		sc.close();
	}

}

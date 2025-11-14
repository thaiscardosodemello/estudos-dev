import java.util.Scanner;

public class exercicioIniciante24 {

	public static void main(String[] args) {
		// EXERCÍCIO 7 - Estrutura Repetitiva (for)
		// Fazer um programa para ler um número inteiro positivo N.
		// O programa deve então mostrar na tela N linhas, começando de 1 até N.
		// Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int primeiro = i;			// valor original
			int segundo = i * i;		// valor ao quadrado i
			int terceiro = i * i * i;	// valor ao cubo i
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
	}

}

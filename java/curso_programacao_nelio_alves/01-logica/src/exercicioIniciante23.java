import java.util.Scanner;

public class exercicioIniciante23 {

	public static void main(String[] args) {
		// EXERCÍCIO 6 - Estrutura Repetitiva (for)
		// Ler um número inteiro N e calcular todos os seus divisores
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = sc.nextInt();
		
		for (int i = 1; i < n ; i++) {
			if (n % i == 0) { // Se o resto da divisão for 0, então i divide n exatamente
                System.out.println(i);
            }
		}
		sc.close();
	}

}

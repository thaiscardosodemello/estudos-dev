import java.util.Scanner;

public class exercicioIniciante09 {

	public static void main(String[] args) {
		// EXERCÍCIO 3 - Estrutura Condicional (if-else)
		// Leia 2 valores inteiros (A e B).
		// Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
		// indicando se os valores lidos são múltiplos entre si.
		// Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite o valor 1:");
		A = sc.nextInt();
		System.out.println("Digite o valor 2:");
		B = sc.nextInt();
		
		
		if (A % B == 0 || B % A == 0) {
			System.out.printf("Os valores %d e %d SÃO MÚLTIPLOS!", A, B);
		} else {
			System.out.printf("Os valores %d e %d NÃO SÃO MÚLTIPLOS!", A, B);
		}
		
		sc.close();
	}

}

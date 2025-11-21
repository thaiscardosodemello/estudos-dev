import java.util.Scanner;

public class exercicioIniciante15 {

	public static void main(String[] args) {
		// EXERCÍCIO 1 - Estrutura Repetitiva (while)
		// Escreva um programa que repita a leitura de uma senha até que ela seja válida. (Scanner + while)
		// Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
		// Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e
		// o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Digite sua senha de 4 dígitos:");
		senha = sc.nextInt();
		
		while ( senha != 2002 ) {
			System.out.println("Senha Inválida!");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		sc.close();
	}

}

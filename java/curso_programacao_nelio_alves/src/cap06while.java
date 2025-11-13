import java.util.Scanner;

public class cap06while {

	public static void main(String[] args) {
		// EXEMPLO
		// Fazer um programa que lê números inteiros até que um zero seja lido.
		// Ao final mostra a soma dos números lidos.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite números até chegar a 00:");
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		sc.close();
	}

}

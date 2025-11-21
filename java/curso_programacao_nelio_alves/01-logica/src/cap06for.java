import java.util.Scanner;

public class cap06for {

	public static void main(String[] args) {
		// EXEMPLO
		// Fazer um programa que lê um valor inteiro N
		// e depois N números inteiros.
		// Ao final, mostra a soma dos N números lidos.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite número: ");
		int n = sc.nextInt();
		
		int  soma = 0;
		for (int i=0; i<n; i++) { // -- decrementa
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		sc.close();
		
		// OBS: com WHILE vc não sabe quando vai parar, 
		// com FOR vc sabe previamente a quantidade de repetições  ou intervalo dos valores. 
		// Ótimo para repetição baseado em contagem.
	}

}

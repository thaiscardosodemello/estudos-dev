import java.util.Locale;
import java.util.Scanner;

public class cap06dowhile {

	public static void main(String[] args) {
		// EXEMPLO
		// Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
		// Perguntar se o usuário deseja repetir (s/n).
		// Caso o usuário digite "s", repetir o programa.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp = 's';
		
		while (resp != 'n') {
			System.out.println("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 +32;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			
			System.out.print("Deseja repetir? (s/n)");
			resp = Character.toLowerCase(sc.next().charAt(0));
			
		}
		
		sc.close();
	}

}

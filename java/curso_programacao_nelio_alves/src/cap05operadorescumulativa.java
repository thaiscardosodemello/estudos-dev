import java.util.Locale;
import java.util.Scanner;

public class sessao05operadorescumulativa {

	public static void main(String[] args) {
		// Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone.
		// Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00.
		// Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minGasto;
		int minContratado = 100;
		double planoBasico = 50.0;
		double taxaExcedente = 2.0;
		double total = planoBasico;
		
		System.out.println("Insira os minutos gastos:");
		minGasto = sc.nextInt();
		
		if ( minGasto > minContratado ) {
			total += ( minGasto - minContratado ) * taxaExcedente;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", total);

		sc.close();
	}

}

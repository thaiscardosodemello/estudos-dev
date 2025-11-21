import java.util.Locale;
import java.util.Scanner;

public class exercicioIniciante14 {

	public static void main(String[] args) {
		// EXERCÍCIO 8 - Estrutura Condicional (if-else)
		// A moeda deste país é o Rombus, cujo símbolo é o R$.
		// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
		// Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		//
		// de R$0,00 até R$2000,00		Isento
		// de R$2000,01 até R$3000,00	8%
		// de R$3000,01 até R$4500,00	18%
		// acima de R$4500,00			28%
		//
		// Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
		// pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		System.out.println("Insira o seu salário mensal: ");
		salario = sc.nextDouble();
		
		if ( salario <= 2000 ) {			
			System.out.printf("ISENTO! A taxa de imposto a ser paga é de R$0.00.");
		} else if ( salario <= 3000 ) {
			imposto = (salario - 2000) * 0.08;			
			System.out.printf("A taxa de imposto a ser paga é de R$ %.2f", imposto);
		} else if ( salario <= 4500 ) {
			imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
			System.out.printf("A taxa de imposto a ser paga é de R$ %.2f", imposto);
		} else {
			imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (salario - 4500.00) * 0.28;			
			System.out.printf("A taxa de imposto a ser paga é de R$ %.2f", imposto);
		}
		
		sc.close();
	}

}

import java.util.Scanner;

public class exercicioIniciante10 {

	public static void main(String[] args) {
		// EXERCÍCIO 4 - Estrutura Condicional (if-else)
		// Leia a hora inicial e a hora final de um jogo.
		// A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
		// tendo uma duração mínima de 1 hora e máxima de 24 horas
		
		Scanner sc = new Scanner(System.in);
		
		double hInicial, hFinal, hTotais;
		
		System.out.println("Digite a hora inicial do jogo: ");
		hInicial = sc.nextDouble();
		System.out.println("Digite a hora final do jogo: ");
		hFinal = sc.nextDouble();
		
		if (hInicial < hFinal) {
			hTotais = hFinal - hInicial;
		} else {
			hTotais = 24 - hInicial + hFinal;
		}
		
		System.out.println("O jogo durou " + hTotais + " hora(s)");

		
		sc.close();
	}

}

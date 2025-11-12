import java.util.Locale;
import java.util.Scanner;

public class exercicioIniciante13 {

	public static void main(String[] args) {
		// EXERCÍCIO 12
		// Leia 2 valores com uma casa decimal (x e y),
		// que devem representar as coordenadas de um ponto em um plano.
		// A seguir, determine qual o quadrante ao qual pertence o ponto,
		// ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		// Se o ponto estiver na origem, escreva a mensagem “Origem”.
		// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite o valor 1:");
		x = sc.nextDouble();
		System.out.println("Digite o valor 2:");
		y = sc.nextDouble();
		
		if ( x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo Y");
		} else if (y == 0) {
			System.out.println("Eixo X");
		} else if ( x > 0 && y > 0) { 	// q1 x > 0 e y > 0
			System.out.println("Q1");
		} else if ( x < 0 && y > 0) { 	// q2 x < 0 e y > 0				
			System.out.println("Q2");
		} else if ( x < 0 && y < 0) { 	// q3 x < 0 e y < 0
			System.out.println("Q3");
		} else {					    // q4 x > 0 e y < 0
			System.out.println("Q4");
		}
		
		sc.close();
	}

}

import java.util.Scanner;

public class exercicioIniciante16 {

	public static void main(String[] args) {
		// EXERCÍCIO 2 - Estrutura Repetitiva (while)
		// Escreva um programa para ler as coordenadas (X,Y)
		// de uma quantidade indeterminada de pontos no sistema cartesiano.
		// Para cada ponto escrever o quadrante a que ele pertence.
		// O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite a primeira coordenada: ");
		x = sc.nextInt();
		System.out.println("Digite a segunda coordenada: ");
		y = sc.nextInt();
		
		while ( x != 0 && y != 0 ) {
			if ( x > 0 && y > 0 ) { // q1 x > 0 e y > 0
				System.out.println("Quadrante 1");
			}
			else if ( x < 0 && y > 0 ) { // q2 x < 0 e y > 0
				System.out.println("Quadrante 2");
			}
			else if ( x < 0 && y < 0 ) { // q3 x < 0 e y < 0
				System.out.println("Quadrante 3");
			}
			else if ( x > 0 && y < 0 ) { // q4 x > 0 e y < 0
				System.out.println("Quadrante 4");
			}

			System.out.println("Digite a primeira coordenada: ");
			x = sc.nextInt();
			System.out.println("Digite a segunda coordenada: ");
			y = sc.nextInt();
		}

		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// Exercício 1
		// Fazer um programa para ler os valores da largura e altura de um retângulo.
		// Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
		// Usar uma classe como mostrado no projeto ao lado.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();	
		
		System.out.println("Enter rectangle width and height:");
		rect.Width = sc.nextDouble();
		rect.Height = sc.nextDouble();
		
		double area = rect.Width * rect.Height;	
		
		double perimeter = 2 * (rect.Width + rect.Height);
					
		double diagonal = Math.sqrt(rect.Width * rect.Width + rect.Height * rect.Height);
			
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Perimeter = %.2f%n", perimeter);
		System.out.printf("Diagonal = %.2f%n", diagonal);
		
		sc.close();
	}

}

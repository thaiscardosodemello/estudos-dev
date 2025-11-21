package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// EXEMPLO COM POO
		// Fazer um programa para ler as medidas dos lados de dois triângulos, X e Y.
		// Em seguida, mostrar o valor das áreas dos dois triângulos usando a fórmula de Heron:
		//
		//		      área = √(p * (p - a) * (p - b) * (p - c))
		//
		// onde:
		//		      p = (a + b + c) / 2
		//
		// Ao final, informar qual triângulo possui a maior área.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle(); 
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.A = sc.nextDouble();
		x.B = sc.nextDouble();
		x.C = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.A = sc.nextDouble();
		y.B = sc.nextDouble();
		y.C = sc.nextDouble();
		
		double p = (x.A + x.B + x.C) / 2.0;
		double areaX = Math.sqrt(p * (p - x.A) * (p - x.B) * (p - x.C));
		
		p = (y.A + y.B + y.C) / 2.0;
		double areaY = Math.sqrt(p * (p - y.A) * (p - y.B) * (p - y.C));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}

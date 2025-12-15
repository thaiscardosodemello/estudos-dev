package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// EXERCICIO 3
		// Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
		// (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
		// Ao final, mostrar qual a nota final do aluno no ano.
		// Dizer também se o aluno está aprovado (PASS) ou nã	o (FAILED) e, em caso negativo,
		// quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
		// Você deve criar uma classe Student para resolver este problema.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student stu = new Student();

		System.out.println("Student's name?");
		stu.name = sc.nextLine();

		System.out.println("1st grade:");
		stu.grade1 = sc.nextDouble();

		System.out.println("2nd grade:");
		stu.grade2 = sc.nextDouble();

		System.out.println("3rd grade:");
		stu.grade3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", stu.finalGrade());

		if (stu.isApproved()) {
			System.out.println("PASS!");
		} else {
			System.out.printf("FAILED! Missing %.2f points%n", stu.missingPoints());
		}

		sc.close();
	}
}
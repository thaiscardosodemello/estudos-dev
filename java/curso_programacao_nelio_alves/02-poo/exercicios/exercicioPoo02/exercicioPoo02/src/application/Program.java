package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// Exercício 2
		// Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
		// Em seguida, mostrar os dados do funcionário (nome e salário líquido).
		// Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o
		// salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.
		// Use a classe projetada abaixo.
		
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Enter your name:");
        emp.Name = sc.next();

        System.out.println("What's your gross salary?");
        emp.GrossSalary = sc.nextDouble();

        System.out.println("What's the tax value?");
        emp.Tax = sc.nextDouble();

        System.out.println("Employee: " + emp.Name + ", $" + emp.NetSalary());

        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();

        emp.IncreaseSalary(percentage);

        System.out.println("Updated data: " + emp.Name + ", $" + emp.NetSalary());

        sc.close();

	}

}

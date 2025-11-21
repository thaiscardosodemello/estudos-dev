import java.util.Scanner;

public class exercicioIniciante01 {

	public static void main(String[] args) {
		// EXERCÍCIO 1 - Estrutura Sequencial  
		//Faça um programa para ler dois valores inteiros, 
		//e depois mostrar na tela a soma desses números
		//com uma, mensagem explicativa, conforme exemplos.

		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, soma;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		
		soma = valor1 + valor2;
		System.out.println("A soma dos valores é = " + soma);
		
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

public class cap04entradadedados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* String x; x = sc.next(); */
		/* int x; x = sc.nextInt(); */		
		/* double x; x = sc.nextDouble(); */
		
		char x;
		x = sc.next().charAt(3);
		//System.out.printf("Você digitou: %.2f%n", x);		
		System.out.println("Você digitou: "+ x);
		
		sc.close();
	}

}

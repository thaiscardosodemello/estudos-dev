import java.util.Scanner;

public class cap05estruturacondicionalcomposta {

	public static void main(String[] args) {
		// V: executa só o bloco do if
		// F: executa somente o bloco do else
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		if (hora >= 5 && hora < 12) {
			System.out.println("Bom dia!");
		}
		else if ( hora >= 12 && hora < 18 ) {
					System.out.println("Boa tarde!");
				}
				else {
					System.out.println("Boa noite!");
				}
	
		sc.close();
	}

}

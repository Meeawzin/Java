import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cod, quant;
		double valor;
		
		cod = sc.nextInt();
		quant = sc.nextInt();
				
		if (cod == 1) {
			valor = 4.00 * quant;	
		}
		else if (cod == 2) {
			valor = 4.50 * quant;	
		}
		else if (cod == 3) {
			valor = 5.00 * quant;	
		}
		else if (cod == 4) {
			valor = 2.00 * quant;	
		}
		else {
			valor = 1.50 * quant;	
		}
		
		System.out.printf("Total: R$ %.2f%n", valor);

		sc.close();
	}

}

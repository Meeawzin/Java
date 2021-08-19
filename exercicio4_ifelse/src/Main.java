import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cod, quant;
		
		cod = sc.nextInt();
		quant = sc.nextInt();
		
		double price;
		
		if (cod == 1) {
			price = quant * 4.00;
		}
		else if (cod == 2) {
			price = quant * 4.50;
		}
		else if (cod == 3) {
			price = quant * 5.00;
		}
		else if (cod == 4) {
			price = quant * 2.00;
		}
		else {
			price = quant * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", price);

		
		sc.close();
			

	}

}

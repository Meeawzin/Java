import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int func, horastrab;
		double valorhora, salario;
		
		func = sc.nextInt();
		horastrab = sc.nextInt();
		valorhora = sc.nextDouble();
		
		salario = valorhora * horastrab;
		
		System.out.println("NUMBER = " + func);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		

	}

}

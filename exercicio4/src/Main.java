import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int numero, horas;
		double valorh, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorh = sc.nextDouble();
		salario = horas * valorh;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
	
		
		sc.close();
	}

}

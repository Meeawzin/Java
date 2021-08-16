import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner (System.in);
		
		
		int numero, horas;
		double valor, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		salario = horas * valor;
				
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
		
		
		
	}

}

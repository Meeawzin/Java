import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Revisão
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int num, horas;
		double valor, salario;
		
		num = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
		
		
	}

}

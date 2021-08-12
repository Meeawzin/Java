import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x, pi, area;
		
		
		x = sc.nextDouble();
		pi = 3.14159;
		area = pi * x * x;
		
		System.out.printf("A=%.4f%n", area);
	
		
		
		
	}

}

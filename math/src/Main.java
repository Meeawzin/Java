import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x ,y ,z, A, B;
		
		x = 9.0;
		y = 4.0;
		z = -4.0;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		
		System.out.println("A RAIZ QUADRADA DE " + x + " = " + A);
		System.out.println("A RAIZ QUADRADA DE " + y + " = " + B);

		System.out.println();
		
		A = Math.pow(x,y);
		
		System.out.println(x + " com potenciação de " + y + " = " + A);
		
		A = Math.abs(z);
		
		System.out.println("o valor absoluto de " + z + " = " + A);
		
		sc.close();
		
	
	}

}

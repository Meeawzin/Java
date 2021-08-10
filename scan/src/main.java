import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Digite seu nome: " + x);
		System.out.println("Digite sua idade: " + y);
		System.out.println("Digite sua altura: " + z);
		
				
		sc.close();
		
		
	}

}

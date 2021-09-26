import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		String s1, s2, s3;
		int x;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados inseridos: ");
		System.out.println("Idade: " + x);
		System.out.println("1 Nome: " +s1);
		System.out.println("2 Nome: " +s2);
		System.out.println("3 Nome: " +s3);
		
		sc.close();
	}
}
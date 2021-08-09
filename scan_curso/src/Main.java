import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		String s1, s2, s3;
		int i1;
		
		i1 = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println("Digite um numero: " + i1);
		System.out.println("Digite um nome: " + s1);
		System.out.println("Digite um nome: " + s2);
		System.out.println("Digite um nome: " + s3);


				
		sc.close();
		
				
				

	}
}
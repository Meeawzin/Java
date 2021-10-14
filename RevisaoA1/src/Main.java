import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int inicio, fim, dura;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (inicio < fim) {
			dura = fim - inicio ;
		}
		else {
			dura = 	24  - fim + inicio;
		}
		
		System.out.println("o jogo durou " + dura + " hora(s)");
		
		sc.close();
	}
	
}


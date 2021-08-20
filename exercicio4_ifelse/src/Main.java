import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int inicio, fim, dura;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (inicio >= fim) {
			dura = 24 - inicio + fim;
		}
		else {	
			dura = fim - inicio;
		}
		
		System.out.println("O JOGO DUROU " + dura + " HORA(S)");
		
		sc.close();
		
	}

}

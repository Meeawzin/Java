import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		int horas = sc.nextInt();
		
		if (horas < 0 || horas >24) {
			System.out.println("horario invalido");
		}
		else if (horas < 12) {
			System.out.println("Bom dia");
		}
		else if (horas < 20) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		
		sc.close();
	}
	
}

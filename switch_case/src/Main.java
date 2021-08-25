import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		String dia;
		
		switch (num) {
		case 1: 
			dia = "domingo";
			break;
		case 2: 
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6: 
			dia = "sexta";
			break;
			
		default:
			dia = "invalido";
			break;
		}
		
		System.out.println(dia);
		
		sc.close();
			
			
		}

}
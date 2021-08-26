import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		String dia;
		
		switch (num) {
		case 1: 
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3: 
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		default:
			dia = "Invalido";
			break;
			
		
		}
	
		
		System.out.println(dia);
		
		sc.close();
			
			
		}

}
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
			
				Scanner sc = new Scanner (System.in);
				
				String x  = sc.nextLine();
				int y = sc.nextInt();
				double z = sc.nextDouble();
				
				System.out.println("Digite seu nome: " + x);
				System.out.println("Digite sua idade: " + y);
				System.out.println("Digite o preço: " + z);
				
				sc.close();
				
			}
		}

import java.util.Scanner;

public class Main {

	// exercicios de mesa e revisão 08/09
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit if false!");
			
		}
		
		sc.close();
	}

}

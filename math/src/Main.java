public class Main {
	public static void main(String[] args) {

		double x,y,z, A, B, C;
		
		x = 3.0;
		y = 4.0;
		z = -5.0;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("A raiz quadrada de " + x + " = " + A);
		System.out.println("A raiz quadrada de " + y + " = " + B);
		System.out.println("A raiz quadrada de " + 25.0 + " = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado à " + y + " = " + A);
		System.out.println(x + " elevado à segunda potencia = " + B);
		System.out.println("5 elevado à segunda potencia = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

		

				
		
		

		
		
			

	}
}
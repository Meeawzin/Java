
public class Main {

	public static void main(String[] args) {
		

		double x1,x2, delta, a,b,c;
		
		a = 2;
		b = 4;
		c = 6;
		
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);	
		
		System.out.println(x1);
		System.out.println(x2);

		
		
		
	}

}

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);
		System.out.print("Nhap so n: ");
		n = k.nextInt();
		
		System.out.print("cos(" + n + ") = " + Math.cos(n) + "\n");
		System.out.print("sin(" + n + ") = " + Math.sin(n) + "\n");
		System.out.print("sqrt(" + n + ") = " + Math.sqrt(n) + "\n");
		
		k.close();
	}
	
}

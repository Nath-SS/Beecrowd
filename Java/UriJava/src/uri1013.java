import java.util.Scanner;
import java.lang.Math;

public class uri1013 {

	public static void main(String[]args) {
		int A, B, C;
		int maior, maiorFinal;
		
		Scanner ler = new Scanner(System.in);
		
		A = ler.nextInt();
		B = ler.nextInt();
		C = ler.nextInt();
		
		maior = (A+B+Math.abs(A-B))/2;
		maiorFinal = (maior+C+Math.abs(maior-C))/2;
		
		System.out.println(maiorFinal+" eh o maior");
		
	}

	
}

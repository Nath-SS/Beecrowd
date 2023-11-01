import java.util.Scanner;

public class uri1007 {

	public static void main(String[]Args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A, B, C, D, Diferença;
		
		A = ler.nextInt();
		B = ler.nextInt();
		C = ler.nextInt();
		D = ler.nextInt();
		
		Diferença = (A*B)-(C*D);
		
		System.out.println("DIFERENCA = "+Diferença);
		
	}
}

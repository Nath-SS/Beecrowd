import java.util.Scanner;
import java.lang.Math;

public class uri1011 {

	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		int R;
		double pi = 3.14159;
		double volume;
		
		
		R = ler.nextInt();
		volume = 4.0/3*pi*(Math.pow(R, 3));
		
		String volumef = String.format("%.3f", volume);
		
		System.out.println("VOLUME = "+volumef);
	}
}

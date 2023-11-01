import java.util.Scanner;
import java.lang.Math;
import java.io.IOException;

public class Beecrowd {
	public static void main(String[] args) throws IOException{
				
	    double R, D;
	        
	    Scanner ler = new Scanner(System.in);
	    R = ler.nextDouble();
	        
	    D = Math.pow(R, 2);
	    String A = String.format("%.4f", (3.14159*D));
	    
	        
	    System.out.println("A="+A);
	    //System.out.printf("A= %.4f\n", A);    
	        
	}
	 
}


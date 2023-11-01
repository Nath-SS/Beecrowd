import java.util.Scanner;
public class uri1005 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double A, B, Media;
        
        A = ler.nextDouble();
        A = A*3.5;
        B = ler.nextDouble();
        B = B*7.5;
        Media = (A+B)/11;
        
        String Mediaf = String.format("%.5f", Media);
        
        System.out.println("MEDIA = "+Mediaf);
        
        
    }
}

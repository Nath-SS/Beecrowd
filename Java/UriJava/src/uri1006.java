import java.util.Scanner;
public class uri1006 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double A, B, C, Media;
        
        A = ler.nextDouble();
        A = A*2;
        B = ler.nextDouble();
        B = B*3;
        C = ler.nextDouble();
        C = C*5;
        Media = (A+B+C)/10;
        
        String Mediaf = String.format("%.1f", Media);
        
        System.out.println("MEDIA = "+Mediaf);
        
        
    }
}

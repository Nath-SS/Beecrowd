import java.util.Scanner;
import java.io.IOException;
public class uri1009 {

	public static void main(String[] args) throws IOException {
		 
        Scanner ler = new Scanner(System.in);
        
        String nome;
        double salario, totalVendido, ganhos, total;
        
        nome = ler.next();
        salario = ler.nextDouble();
        totalVendido = ler.nextDouble();
        
        ganhos = (totalVendido*15)/100;
        total = salario+ganhos;
        
        String totalf = String.format("%.2f", total);
        System.out.println("TOTAL = R$ "+totalf);
        
 
    }
}

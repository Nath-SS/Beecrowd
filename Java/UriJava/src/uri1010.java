import java.util.Scanner;
public class uri1010 {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		int produto1, unidades1;
		int produto2, unidades2;
		double quantidade1, quantidade2;
		double preço1, preço2, valorTotal;
		
		produto1 = ler.nextInt(); unidades1 = ler.nextInt(); preço1 = ler.nextDouble();
		produto2 = ler.nextInt(); unidades2 = ler.nextInt(); preço2 = ler.nextDouble();
		
		quantidade1 = preço1*unidades1;
		quantidade2 = preço2*unidades2;
		
		valorTotal = quantidade1+quantidade2;
		String valorTotalf = String.format("%.2f", valorTotal);
		
		System.out.println("VALOR A PAGAR: R$ "+valorTotalf);
		
	}

}

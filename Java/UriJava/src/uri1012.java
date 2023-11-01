import java.util.Scanner;
import java.lang.Math;

public class uri1012 {

	public static void main(String[]args) {
		
		double A, B, C;
		double areaTriangulo;
		double areaCirculo, pi = 3.14159;
		double areaTrapezio;
		double areaQuadrado;
		double areaRetangulo;
		
		Scanner ler = new Scanner(System.in);
		
		A = ler.nextDouble();
		B = ler.nextDouble();
		C = ler.nextDouble();
		
		areaTriangulo = A*C/2;
		areaCirculo = Math.pow(C, 2)*pi;
		areaTrapezio = (A+B)*C/2;
		areaQuadrado = Math.pow(B, 2);
		areaRetangulo = A*B;
		
		String triangulo = String.format("%.3f", areaTriangulo);
		String circulo = String.format("%.3f", areaCirculo);
		String trapezio = String.format("%.3f", areaTrapezio);
		String quadrado = String.format("%.3f", areaQuadrado);
		String retangulo = String.format("%.3f", areaRetangulo);
		
		System.out.println("TRIANGULO: " +triangulo);
		System.out.println("CIRCULO: " +circulo);
		System.out.println("TRAPEZIO: " +trapezio);
		System.out.println("QUADRADO: " +quadrado);
		System.out.println("RETANGULO: " +retangulo);
		
		
		
	}
}

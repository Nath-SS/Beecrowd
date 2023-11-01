import java.util.Scanner;
public class uri1008 {

	public static void main(String[] args) {
		 
        Scanner ler = new Scanner(System.in);
        
        int numero, horasTrabalhadas;
        double valorHora, salario;
        
        numero = ler.nextInt();
        horasTrabalhadas = ler.nextInt();
        valorHora = ler.nextDouble();
        
        salario = horasTrabalhadas*valorHora;
        String salariof = String.format("%.2f", salario);
        
        
        System.out.println("NUMBER = "+numero);
        System.out.println("SALARY = U$ "+salariof);
 
    }
}

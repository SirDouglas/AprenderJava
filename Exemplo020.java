import java.util.Scanner;
public class Exercicio020 {
	
	static double recebeSalario(double salarioAtual) {
		double salarioNovo = 0;
		if (salarioAtual>=600) {
			salarioNovo = salarioAtual + salarioAtual * 0.11;
		}else {
			salarioNovo = salarioAtual + salarioAtual * 0.02;
		}
		return salarioNovo;
	}
	public static void main(String[] args) {
		System.out.println("Exercicio 20");
		Scanner entrada = new Scanner(System.in);
		double salarioAtual = entrada.nextDouble();
		System.out.println(recebeSalario(recebeSalario(salarioAtual)));
	}
}

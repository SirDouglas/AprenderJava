import java.util.Scanner;
public class Exercicio019 {
	
	static double salarioValores (double salario,double imposto,double grata) {
		double salarioLiquido = salario - imposto + grata;
		return salarioLiquido;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o salario do funcionario");
		double salario = entrada.nextDouble();
		System.out.println("Digite o imposto de renda do funcionario");
		double imposto = entrada.nextDouble();
		System.out.println("Digite a gratificação do funcionario");
		double grata = entrada.nextDouble();
		double salarioLiquido = salarioValores(salario,imposto,grata);
		System.out.println(salarioLiquido);
	if (salarioLiquido < 400) {
		System.out.println("Aumentar gratificação");
	}else {
		System.out.println("Gratificação OK");
	}
	}
}

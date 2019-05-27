import java.util.Scanner;
public class Exercicio009 {
	public static void main(String[] args) {
		System.out.println("Oi");
		Scanner dado = new Scanner(System.in);
		double salario = dado.nextDouble();
		if (salario <= 300 ) {
			salario = salario * 1.50;
			System.out.println(salario);
		}else if (salario>300 && salario<=500) {
				salario = salario * 1.30;
			System.out.println(salario);
		}else {
			System.out.println(salario);
		}
	}
}

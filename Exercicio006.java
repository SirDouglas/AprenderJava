import java.util.Scanner;
public class Exercicio006 {
	public static void main(String[] args) {
		System.out.println("Exercicio 6");
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int soma = num1 + num2;
		int sub = num2 - num1;
		int mult = num1 * num2;
		int div = num1 / num2;
		System.out.println("A soma dos dois números é " + soma);
		System.out.println("A multiplicacao é " + mult);
		System.out.println("A subtração é " + sub);
		System.out.println("A divisão dos dois números é " + div);
	}
}

import java.util.Scanner;
public class Exercicio011 {
	public static void main(String[] args) {
		System.out.println("Terra");
		double mediaSalario = 0;
		Scanner entrada = new Scanner(System.in);
		for (int i=1;i<=5;i++) {
			mediaSalario += entrada.nextDouble();
		}
		mediaSalario = mediaSalario /5;
		System.out.print(mediaSalario);
	}
}

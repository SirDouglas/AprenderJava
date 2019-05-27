import java.util.Scanner;
public class Exercicio008 {
	public static void main(String[] args) {
		System.out.println("Oi");
		Scanner entrada = new Scanner(System.in);
		double poupanca = entrada.nextDouble();
		double rendimento= poupanca * 0.12;
	 	double totalPoupanca = rendimento + poupanca;
	 	System.out.println("Rendimento da poupança " + rendimento);
	 	System.out.println("Total da poupança " + totalPoupanca);
	}
}

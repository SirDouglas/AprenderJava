import java.util.Scanner;
public class Exercicio028 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double vetor[] = new double [5];

		for (int i=0;i<4;i++) {
			vetor[i] = entrada.nextDouble();
		vetor[i] = vetor[i] * 2;
		}
		for (int i=0;i<4;i++) {
		System.out.println(vetor[i]);
		}
		}
}

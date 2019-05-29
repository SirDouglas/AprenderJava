import java.util.Scanner;
public class Exercicio025 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double vetor[] = new double [5];
		double media = 0;
		double somatorio = 0;
		double mediaDois = 0;
		for (int i=0;i<4;i++) {
			vetor[i] = entrada.nextDouble();
			media += vetor[i];
			somatorio += vetor[i];
		}
		media = media /4;
		mediaDois = (media + somatorio)/2;
    System.out.println(somatorio);
	System.out.println(media);
	System.out.println(mediaDois);
	}
}

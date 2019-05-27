import java.util.Scanner;
public class Exercicio010 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int media = 0;
		int soma = 0;
		int quadrado = 0;
		for (int i=0;i<5;i++) {
			int numero = entrada.nextInt();
			media += numero;
			quadrado += numero;
			soma += numero;
		}
		System.out.println("Soma " +soma);
		quadrado = quadrado * quadrado;
		
		System.out.println("Quadrado " + quadrado);
		media = media /5;
		System.out.println("Media dos números " + media);
	}	
}

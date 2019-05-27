import java.util.Scanner;
public class Exercicio007 {
	public static void main(String[] args) {
		System.out.println("Oi");
		Scanner dado = new Scanner(System.in);
		int quadrado = dado.nextInt();
		quadrado = quadrado * quadrado;
		System.out.println("O quadrado é " + quadrado);
	}
}

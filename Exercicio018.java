import java.util.Scanner;
public class Exercicio018 {
	static int somaValores(int n1,int n2,int n3, int n4) {
		int soma = n1+n2+n3+n4;
		return soma;
	}
	public static void main(String[] args) {
		System.out.println("Hello");
			Scanner entrada = new Scanner(System.in);
			int n1 = entrada.nextInt();
			int n2 = entrada.nextInt();
			int n3 = entrada.nextInt();
			int n4 = entrada.nextInt();
			System.out.println("\n" + somaValores(n1,n2,n3,n4));
	}
}

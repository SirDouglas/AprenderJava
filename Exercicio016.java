import java.util.Scanner;
public class Exercicio016 {
	public static void main(String[] args) {
		System.out.println("Oi");
		int i = 1;
		int somatorio = 0;
		int produto = 1;
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		do {
		 somatorio += i;
		 produto *= i;
		 i++;
		}while(i<=n);
		System.out.println(somatorio);
		System.out.println(produto);
	}
}

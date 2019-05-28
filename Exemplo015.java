import java.util.Scanner;
public class Exercicio015 {
	public static void main(String[] args) {
		int i = 0;
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		int n = 0;
				do {
			n = i * x;
			System.out.println(x + " * " + i + " = " + n);
			i++;
		}while(i<=10);
	}
}

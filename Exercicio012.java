import java.util.Scanner;
public class Exercicio012 {
	public static void main(String[] args) {
		System.out.println("Exericio012");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		int n = 0;
		for (int i=1;i<=num;i++) {
			n += i;
		}
		System.out.println(n);
	}
}

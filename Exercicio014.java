import java.util.Scanner;
public class Exercicio014 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		int n = 0;
		int i = 1;
		while (i<=10) {
			n = x * i;
			System.out.println( x + " * " + i + " = " + n );
			i++;
		}
		
	}
}

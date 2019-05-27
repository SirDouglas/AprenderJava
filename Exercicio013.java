import java.util.Scanner;
public class Exercicio013 {
	public static void main(String[] args) {
		System.out.println("Exercicio013");
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		int n = 0;
		for(int i=1;i<=10;i++) {
			n = x * i;
			System.out.println(x + " * " + i +  " = " + n);
		}
	}
}

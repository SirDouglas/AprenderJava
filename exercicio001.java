import java.util.Scanner;
public class Exercicio001 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		String nome = entrada.nextLine();
		System.out.println("Digite o seu sobrenome.");
		String sobrenome = entrada.nextLine();
		System.out.println(nome + " " + sobrenome);
	}
}

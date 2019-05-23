import java.util.Scanner;
public class Exercicio002 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		String nome = dado.nextLine();
		System.out.println("Digite o nome da sua escola");
		String escola = dado.nextLine();
		System.out.println("Seja Bem Vindo " + nome + " Você estuda na escola " + escola);
	}
}

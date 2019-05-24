import java.util.Scanner;
public class Exercicio005 {
	public static void main(String[] args) {
		System.out.println("Exercicio 005");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine(); 
	    int idade = entrada.nextInt();
	    int dias = 0;
	    dias = idade * 365;
	    System.out.println("Nome " + nome);
	    System.out.println("Você já viveu " + dias + " dias.");
	}
}

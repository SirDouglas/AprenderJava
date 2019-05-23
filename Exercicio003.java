import java.util.Scanner;
public class Exercicio003 {
	public static void main(String[] args) {
		Scanner dado = new Scanner (System.in);
     System.out.println("Digite o seu nome");
		String nome = dado.nextLine();
		System.out.println("Digite o seu CPF");
		String cpf = dado.nextLine();
		System.out.println("Digite o seu RG");
		String rg = dado.nextLine();
		System.out.println("Digite o seu Endereço");
		String endereco = dado.nextLine();
		System.out.println("Digite o Estado Civil");
		String estadoCivil = dado.nextLine();
		System.out.println("Digite o seu Sexo");
		String sexo = dado.nextLine();
		for (int i=0; i<60;i++) {
			System.out.print("#");
		}
		
		System.out.println("\n# Nome                     " + nome + "                     #");
		System.out.println("# CPF                     " + cpf + "                         #");
		System.out.println("# RG                     " + rg + "                           #");
		System.out.println("# Endereço                     " + endereco + "               #");
		System.out.println("# Nome                     " + estadoCivil + "                #");
		System.out.println("# Nome                     " + sexo + "                       #");
			for (int i=0; i<60;i++) {
			System.out.print("#");
		}
	}
}

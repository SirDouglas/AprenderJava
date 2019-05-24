import java.util.Scanner;
public class Exercicio004 {
	public static void main(String[] args) {
         Scanner dado = new Scanner(System.in);
         int anoAtual = 2019;
         System.out.println("Digite o ano do seu nascimento");
         int anoNasc = dado.nextInt();
         int idade = anoAtual - anoNasc;
         System.out.println("A sua idade é " + idade);
	}
}

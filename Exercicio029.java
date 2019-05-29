import java.util.Scanner;
public class Exercicio029 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nomeCliente[] = new String [2];
		String estadoCliente[] = new String [2];
		double totalVenda[] = new double [2];

		for (int i=0;i<2;i++) {
			System.out.println("Digite o nome do Cliente");
			nomeCliente[i] = entrada.next();
			System.out.println("Digite o estado Cliente do Cliente");
			estadoCliente[i] = entrada.next();
			System.out.println("Digite o total da venda do Cliente");
		totalVenda[i] =  entrada.nextDouble();
		}
		for (int i=0;i<2;i++) {
		System.out.println(totalVenda[i]);
		}
		}
}

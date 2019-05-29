import javax.swing.JOptionPane;
public class Exercicio023 {
	static void pecaNumero() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		for (int i=0;i<=numero;i++)	{
			if (i%2 == 0 ) {
				System.out.println(i);	
			}
		    
		}
		
		for (int i=0;i<=numero;i++)	{
			if (i%2 != 0) {
				System.out.println(i);
			}
			
		}
	}
	public static void main(String[] args) {
		pecaNumero();
	}
}

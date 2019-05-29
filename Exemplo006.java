import javax.swing.JOptionPane;
public class Exemplo006 {
	public static void main(String[] args) {
		System.out.println("Hello Exemplo 099");
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int numero2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		JOptionPane.showMessageDialog(null,"O numero digitado foi " + Integer.toString(numero1 + numero2));
			
	}
}

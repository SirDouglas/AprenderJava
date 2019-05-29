import javax.swing.JOptionPane;
public class Exemplo002 {
	public static void main(String[] args) {
		System.out.println("Hello Exemplo 099");
		String numero = JOptionPane.showInputDialog("Digite um numero");
		JOptionPane.showMessageDialog(null,"O numero digitado foi " + numero);
	}
}

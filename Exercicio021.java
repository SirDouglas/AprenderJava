import javax.swing.JOptionPane;
public class Exercicio021 {
	public static void main(String[] args) {
		System.out.println("Hello 021");
	double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
	double porcINSS = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do INSS"));
	double porcImp = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do Imposto de renda"));
	if (salario <= 300 ) {
		salario += salario * 0.20; 
	}else if (salario >= 500) {
		salario += salario * 0.10;
	}
	double liquido = salario - (salario*(porcINSS/100)) - (salario*(porcImp/100));
		JOptionPane.showMessageDialog(null,Double.toString(liquido));
		 
	}
}

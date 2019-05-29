import javax.swing.JOptionPane;
public class Exercicio022 {
	
	static double salarioFunc(double salario,double porINSS,double porcImp) {
			if (salario <= 300 ) {
		salario += salario * 0.20; 
	}else {
		salario += salario * 0.10;
	}	
	salario +=  (salario* (porINSS/100))- (salario* (porcImp/100));	
		return salario;
	}
	public static void main(String[] args) {
		
		System.out.println("Hello 021");
	double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
	double porcINSS = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do INSS"));
	double porcImp = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do Imposto de renda"));
	
	double liquido = salarioFunc(salario,porcINSS,porcImp);
		JOptionPane.showMessageDialog(null,Double.toString(liquido));
		 
	}
	
}

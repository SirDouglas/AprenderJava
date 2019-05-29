import java.util.Scanner;
public class Exercicio017 {
	static int somaValor(int n1,int n2) {
		return n1 + n2;
	}
	
	static double mediaValor(int n1,int n2) {
		double media = (n1+n2) / 2;
		return media;
	}
	
	public static void main(String[] args) {
		int soma = somaValor(200,30);
		System.out.println("Soma " + soma);	
		double media = mediaValor(100,100);
		System.out.println("Media " + media);
		
	}
}

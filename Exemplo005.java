public class Exemplo005 {
	public static void main(String[] args) {
		System.out.println("Err");
		int x = 0;
		int i = 0;
		int l = 0;
		x = 7;
		i = 2;
		l = 1;
		int m = 0;
		//adição
		m = l + i;
		//subtração
		int cc = m - i;
		//multiplicação
		int p = i * 2;
		//divisão
		int w = i /2;
		System.out.println("Err - " + m);
		if (m == 2) {
			System.out.println("M é um 2");
		} else {
			System.out.println("M não é um 2");
		}
		System.out.println("Mult - " + p);
		System.out.println("Divisão - " + w);
		int j = 13 % 2;
		System.out.println("Resto - " + j);
		if ( (5 == 2) || (5 > 2) ) {
			System.out.println("Maior");
		} else {
			System.out.println("Menor");
		}
	}
}

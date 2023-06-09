package problem_5;

public class MenorMultiplo {
	public static void main(String[] args) {
		final int MAX = 20;
		int menorMultiplo = 1;
		for (int i =2; i<=MAX; i++) {
			menorMultiplo = calculaMMC(menorMultiplo, i);
		}
		System.out.println(menorMultiplo);
	}
	public static int calculaMMC(int n1, int n2) {
		int mdc = calculaMDC(n1, n2);
		return (n1 * n2) / mdc;
		
	}
	public static int calculaMDC(int n1, int n2) {
		if(n2 ==0) {
			return n1;
		}
		return calculaMDC(n2, n1%n2);
	}

}

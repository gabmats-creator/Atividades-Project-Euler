package problem_4;

public class MaiorPalindromo {
	public static void main(String[] args) {
		final int INIT = 100;
		final int MAX = 999;
		int fator1 = 0;
		int fator2 = 0;
		int prod = 0;
		int palinMaximo = 0;
		for (int i = INIT; i <= MAX; i++) {
			for (int j = INIT; j <= MAX; j++) {
				prod = i * j;
				String strNum = Integer.toString(prod);
				String reversedNum = new StringBuilder(strNum).reverse().toString();
				if (strNum.equals(reversedNum)) {
					palinMaximo = prod;
					fator1 = i;
					fator2 = j;
				}

			}
		}
		System.out.println("O palindromo maximo do produto entre dois numeros de tres digitos corresponde a: " + palinMaximo + " que equivale ao produto de "+ fator1 + " e " + fator2);
	}
}

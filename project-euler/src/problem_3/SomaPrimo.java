package problem_3;

public class SomaPrimo {
	public static void main(String[] args) {
		long numero = 600851475143L;
		long maiorFatorPrimo = 0;

		for (long i = 2; i * i <= numero; i++) {
			while (numero % i == 0) {
				maiorFatorPrimo = i;
				numero /= i;
			}
		}
		if (numero > 1) {
			maiorFatorPrimo = numero;
		}
		System.out.println("O maior fator primo do numero equivale a " + maiorFatorPrimo);
	}
}
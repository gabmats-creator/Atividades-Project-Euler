package problem_1;

public class Multiplos3e5 {
	public static void main(String[] args) {
		final int MAX = 1000;
		int soma = 0;
		for (int i = 0; i <MAX; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				soma += i;
			}
		}
		System.out.println(soma);
	}
}

package problem_2;

public class Fibonacci {
	public static void main(String[] args) {

		int t1 = 1;
		int t2 = 2;
		int soma = 0;
		do {
			if (t2 % 2 == 0) {
				soma += t2;
			}
			int t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
			
		} while (t2 <= 4000000);
		System.out.println(soma);
	}
}

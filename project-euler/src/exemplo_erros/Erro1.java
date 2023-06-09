package exemplo_erros;

public class Erro1 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println(arr[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Index out of bounds");
			e1.printStackTrace();
		} catch (Exception e2) {
			System.out.println("Exception");
			e2.printStackTrace();
		} finally {
			System.out.println("Fim");
		}

	}
}

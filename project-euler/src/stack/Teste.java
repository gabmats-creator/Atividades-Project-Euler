package stack;

public class Teste {
	public static void main(String[] args) {
	
		
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println(s.ToString());
		
		try {
			for(int i = 0; i< 3; i++){
				System.out.println(s.pop());
			}
		}catch (StackUnderflowException e) {
			e.printStackTrace();
		}
	}

}

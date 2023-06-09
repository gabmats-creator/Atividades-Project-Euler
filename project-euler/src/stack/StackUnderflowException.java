package stack;

public class StackUnderflowException extends Exception {
	public StackUnderflowException() {
		super("Não é possível acessar o topo da pilha");
	}
}

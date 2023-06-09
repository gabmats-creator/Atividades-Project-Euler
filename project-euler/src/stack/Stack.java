package stack;

public class Stack {
	private Node topo;
	int size;
	
	public void push(int valor) {
		Node temp = new Node(valor);
		temp.next = this.topo;
		this.topo = temp;
		this.size++;
	}
	
	public int pop() throws StackUnderflowException {
		if(this.topo == null) {
			throw new StackUnderflowException();
		}
		int aux = this.topo.valor;
		this.topo = this.topo.next;
		this.size--;
		System.gc();
		return aux;
	}
	public String ToString() {
		String out = "Topo [";
		Node aux = this.topo;
		while(aux != null) {
			out += aux.valor;
			out += (aux.next != null ? ", " : "]");
			aux = aux.next;
		}
		return out;
	}
}

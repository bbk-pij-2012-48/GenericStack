public class StackNode<N extends Number> {
	
	public StackNode(N value) {
		this.value = value;
		next = null;
	}
	
	public N value;
	public StackNode next;
}

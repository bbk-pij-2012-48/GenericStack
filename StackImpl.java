public class StackImpl<N extends Number> implements Stack<N> {
	private StackNode<N> base;
	
	public void push(N num){
		if(base == null) {
			StackNode<N> newBase = new StackNode(num);  // Can't do this. Why not? What to do instead?
			base = newBase;
			return;
		}
		StackNode<N> temp = base;
		while(temp.next != null) {
			temp = temp.next;
		}
		StackNode<N> numNode = new StackNode(num);
		temp.next = numNode;
		return;		
	}
	
	public N pop(){
		if (empty()) {
			return null;
		}
		if (base.next == null) {
			N returnValue = base.value;
			base = null;
			return returnValue;
		}
		StackNode<N> temp = base;
		while(temp.next.next != null){
			temp = temp.next;
		}
		N returnValue = temp.next.value;
		temp.next = null;
		return returnValue;
	}
	
	public boolean empty(){
		if (base == null) {
			return true;
		}
		return false;
	}
}
	

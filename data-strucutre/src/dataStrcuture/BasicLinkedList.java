package dataStrcuture;

public class BasicLinkedList<X> {
	
	private Node first;
	private Node last;
	private int nodeCount;
	
	public BasicLinkedList() {
		first = null;
		last = null;
		nodeCount = 0;
	}
 
	public void add(X item) {
		// this condition means that we are adding in the first item
		if(first == null) {
			first = new Node(item);
			last = first;
		}else {
			Node newLastNode = new Node(item);
			last.setNextNode(newLastNode);
			last = newLastNode;
		}
		nodeCount++;
	}
	
	public X remove() {
		if(first == null) {
			throw new IllegalStateException("No more item in the list");
		}else {
			X nodeItem = first.getNodeItem();
			
			first = first.getNextNode();
			nodeCount--;
			return nodeItem;
		}
	}
	public int size() {
		return nodeCount;
	}
	
	private class Node {
		private  Node nextNode;
		private X nodeItem;
		
		public Node(X item) {
			this.nextNode = null;
			this.nodeItem = item;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}
		
		public Node getNextNode() {
			return nextNode;
		}
		public X getNodeItem() {
			return nodeItem;
		}
		
		
	}
	
}

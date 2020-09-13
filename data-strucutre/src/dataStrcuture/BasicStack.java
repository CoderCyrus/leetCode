package dataStrcuture;

public class BasicStack implements Stack<Object>{

	private Object [] data;
	private int stackPointer;
	
	public BasicStack() {
		data = (Object[]) new Object[1000];
		stackPointer = 0;
	}
	
	@Override
	public void push(Object newItem) {
		data[stackPointer++] = newItem;
	}
	
	@Override
	public Object pop() {
		if(stackPointer == 0) {
			throw new IllegalStateException("No more item on the stack"); 
		}
		return data[--stackPointer];
	}
	
	@Override
	public boolean contains(Object item) {
		boolean found = false;
		
		for(int i = 0 ; i < stackPointer; i++) {
			if(data[i].equals(item)) {
				found = true;
				break;
			}
		}
		return found;
	}
	@Override
	public Object access(Object item) {
		while(stackPointer > 0) {
			Object itemTemp = pop();
			if(item.equals(itemTemp)) {
				return itemTemp;
			}
		}
		throw new IllegalArgumentException("Could not find the item on the stack " + item); 
	}
	
	@Override
	public int size() {
		return stackPointer;
	}
	
}


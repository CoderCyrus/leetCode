package dataStrcuture;

public class BasicQueue<X> {
	private X[] data;
	private int front;
	private int end;

	public BasicQueue() {
		this(1000);
	}

	public BasicQueue(int size) {
		this.front = -1;
		this.end = -1;
		data = (X[]) new Object[size];
	}

	public int size() {
		// if the queue is empty return 0
		if (front == -1 && end == -1) {
			return 0;
		}
		// otherwise return the length of queue
		else {
			return end - front + 1;
		}
	}

	// add item
	public void enQueue(X item) {
		if ((end + 1) % data.length == front) {
			throw new IllegalStateException("The Queue is full");
		} else if (size() == 0) {
			front++;
			end++;
			data[end] = item;
		} else {
			end++;
			data[end] = item;
		}
	}

	// delete item
	public X deQueue() {
		X item = null;

		// if the Queue is empty, throw exception
		if (size() == 0) {
			throw new IllegalStateException("No more item on the Queue");
		} else if (front == end) {
			item = data[front];
			data[front] = null;
			front = -1;
			end = -1;
		} else {
			item = data[front];
			data[front] = null;
			front++;
		}
		return item;
	}

	public boolean contains(X item) {
		boolean found = false;
		// if the Queue is empty just immediately return false
		if (size() == 0) {
			return found;
		} else {
			for (int i = front; i < end; i++) {
				if (data[i].equals(item)) {
					found = true;
					break;
				}
			}
			return found;
		}
	}

	public X access(int position) {
		// position refers to the position on Queue not the position on the list
		if (size() == 0 || position > end) {
			throw new IllegalArgumentException(
					"No item on the Queue or the position is greater is biiger than the end");
		} else {
			int index = 0;
			for (int i = front; i < end; i++) {
				if (index == position) {
					return data[i];
				}
				index++;
			}
		}
		throw new IllegalArgumentException("Couldnot get Queue item at position :" + position);
	}

}

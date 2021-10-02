package lecture_37;

public class stack {
	protected int[] data;
	protected int tos  ;

	public stack() {
		data = new int[5];
		tos = -1;
	}

	public stack(int cap) {
		data = new int[cap];
		tos = -1;
	}

	public void push(int ele) throws Exception {
		if(isFull()) {
		throw new Exception("Stack is Full!!");
		}
		tos++;
		data[tos] = ele;
	}

	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
	}

	public int peek() {
		return data[tos];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isFull() {
		return size() == data.length;
	}

	public boolean isEmpty() {
		return size() == 0;

	}

	public void display() { // we don't want to empty our stack
		int temp = tos;
		while (temp >= 0) {
			System.out.print(data[temp] + " ");
			temp--;
		}
		System.out.println(" + end");

	}
}

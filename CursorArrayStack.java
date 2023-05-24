package application;

;

public class CursorArrayStack<T extends Comparable<T>> implements StackInterface<T> {

	CursorArray<T> ca = new CursorArray<T>(1000);
	int l = ca.createList();

	@Override
	public void push(T data) {
		if (!ca.insertAtHead(data, l))
			System.out.println("Error Satck Overflow!!!!");
	}

	@Override
	public Comparable<T> pop() {
		return ca.deleteFirst(l);
	}

	@Override
	public Comparable<T> peek() {
		return ca.getFirst(l);
	}

	@Override
	public boolean isEmpty() {
		return ca.isEmpty(l);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}
	public boolean isNulll() {
		return ca.isNull( l);
	}

	public int length() {
		return ca.length();
	}

}
package application;

public interface StackInterface<T extends Comparable<T>> {

	void push(T data);

	Comparable<T> pop();

	Comparable<T> peek();

	boolean isEmpty();

	void clear();

}

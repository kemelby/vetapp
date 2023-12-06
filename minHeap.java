package vetApp;
/*
 * minHeap Sort Method based on the BinaryMaxHeap implenetation from class.
 * 
 * @author kemelby
 * 
 */

public class minHeap<T extends Comparable<? super T>> {
	private T[] heap;
	
	private int size;
	
	public BinaryMinHeap(int capacity) {
		heap = (T[]) (new Comparable[caoacity]);
		size = 0;
	} //Constructor
	
	public BinaryMinHeap(T[] array) {
		buildHeap(array);
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public T findMin() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException("Empty heap has no min");
		}
		return heap[0];
	}
	
	public void insert(T item) {
		int parent;
		int curIndex = size;
		parent = (curIndex -1) / 2;
		heap[curIndex] = item;
		percUp(curIndex, parent);
		size++;
	}
	
	
} //minHeap Method

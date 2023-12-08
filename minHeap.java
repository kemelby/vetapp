package vetApp;
/*
 * minHeap Sort Method based on the BinaryMaxHeap implementation from class.
 * 
 * @author kemelby
 * 
 */

public class minHeap<T extends Comparable<? super T>> {
	private T[] heap;
	private int size;
	
	public minHeap(int capacity) {
		heap = (T[]) (new Comparable[capacity]);
		size = 0;
	} //Constructor
	
	public minHeap(T[] array) {
		buildHeap(array);
	}
	
	public boolean isEmpty() {
		return size == 0;
	} //check if empty
	
	public T findMin() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException("Empty heap has no min");
		}
		return heap[0];
	} //find the min
	
	public void insert(T item) {
		int parent;
		int curIndex = size;
		parent = (curIndex -1) / 2;
		heap[curIndex] = item;
		percUp(curIndex, parent);
		size++;
	} //insert method
	
	private void percUp(int curIndex, int parent) {
		T temp;
		while(curIndex!= 0 && heap[curIndex].compareTo(heap[parent]) <0) {
			temp = heap[curIndex];
			heap[curIndex] = heap[parent];
			heap[parent] = temp;
			
			curIndex = parent;
			parent = (curIndex-1) / 2;
		}
	}
	
	public T deleteMin() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException("Empty heap has no min");
		}
		T minItem = heap[0];
		heap[0] = heap[--size];
		percDown(0);
		return minItem;
	} //deleteMin
	
	private void percDown(int curIndex) {
		int swapIndex, leftChild, rightChild;
		
		while(true) {
			leftChild = curIndex*2+1;
			rightChild = leftChild+1;
			if(leftChild >= size)
			{
				return;
			}
			swapIndex = curIndex;
			if(heap[leftChild].compareTo(heap[curIndex]) < 0)
			{
				swapIndex = leftChild;
			}
			if(rightChild <= size)
			{
				if(heap[rightChild].compareTo(heap[swapIndex]) < 0)
				{
					swapIndex = rightChild;
				}
			}
			if(swapIndex == curIndex) {break;}
			T temp = heap[curIndex];
			heap[curIndex] = heap[swapIndex];
			heap[swapIndex] = temp;
		}
	} //percDown
	public void buildHeap(T[] array) {
		heap = array;
		size = array.length;
		for(int i =((size-1)-1) / 2; i >= 0; i--) {
			percDown(i);
		}
	} //buildHeap
	
	public static <Type extends Comparable<? super Type>> void heapSort(Type [] array) {
		minHeap<Type> bmh = new minHeap<Type>(array);
		for (int i = array.length-1; i > 0; i--) {
			array[i] = bmh.deleteMin();
		}
	} //heapSort
	
	
} //minHeap Method

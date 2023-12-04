package vetApp;

class MinHeap<T extends Comparable<T>> {
    private java.util.ArrayList<T> items;

    public MinHeap() {
        items = new java.util.ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
        heapifyUp();
}

	private void heapifyUp() {
		// TODO Auto-generated method stub
		
	}
}
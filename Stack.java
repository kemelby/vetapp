package vetApp;

class Stack<T> {
    private java.util.LinkedList<T> items;

    public Stack() {
        items = new java.util.LinkedList<>();
    }

    public void push(T item) {
        items.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return items.removeFirst();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public java.util.LinkedList<T> getItems() {
        return new java.util.LinkedList<>(items);
    }
}

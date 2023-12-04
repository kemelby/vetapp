package vetApp;

class CircularLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private Node<T> current;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
            tail.setNext(head);
        } else {
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
    }

    public void remove() {
        if (head != null) {
            if (head == tail) {
                head = null;
                tail = null;
                current = null;
            } else {
                head = head.getNext();
                tail.setNext(head);
            }
        }
    }

    public T get() {
        if (current != null) {
            return current.getData();
        }
        return null;
    }

    public void rotate() {
        if (current != null) {
            current = current.getNext();
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
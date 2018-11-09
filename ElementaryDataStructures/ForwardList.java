package ElementaryDataStructures;

public class ForwardList<T> {
    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }
    }

    public class ForwardListIterator implements Iterator<T> {
        private Node current;

        public ForwardListIterator(Node node) {
            current = node;
        }

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            T value = current.getValue();

            current = current.getNext();

            return value;
        }
    }

    private Node head;
    private Node tail;

    public T getHeadValue() {
        return head.getValue();
    }

    public Iterator<T> getIterator() {
        return this.new ForwardListIterator(head);
    }

    public void insert(T val) {
        ForwardList<T>.Node node = this.new Node(val);
        
        if (head == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            tail = tail.getNext();
        }
    }

    public void delete(Node node) {

    }

    public Node search(int key) {
        return null;
    }
}
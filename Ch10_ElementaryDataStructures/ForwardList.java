package Ch10_ElementaryDataStructures;

public class ForwardList<T> {
    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public void setValue(T value) {
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

    private Node head;

    public T getHeadValue() {
        return head.getValue();
    }

    public void insert(T val) {
        ForwardList<T>.Node node = this.new Node(val);
        
        head = node;
    }

    public void delete(Node node) {

    }

    public Node search(int key) {
        return null;
    }
}
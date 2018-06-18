package Ch10_ElementaryDataStructures;

public class ForwardList<T> {
    public class Node {
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

    public Node getHead() {
        return head;
    }

    public void insert(Node node) {
        head = node;
    }

    public void delete(Node node) {

    }

    public Node search(int key) {
        return null;
    }
}
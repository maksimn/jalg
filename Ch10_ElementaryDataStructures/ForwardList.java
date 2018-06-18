package Ch10_ElementaryDataStructures;

public class ForwardList {
    public static class Node<T> {
        private int key;
        private T value;
        private Node next;

        public Node(int key, T value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
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

    public Node head;

    public void insert(Node node) {
        head = node;
    }

    public void delete(Node node) {

    }

    public Node search(int key) {
        return null;
    }
}
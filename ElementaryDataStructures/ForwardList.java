package ElementaryDataStructures;

public class ForwardList<T> {
    public class Node {
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
			if (current != null) {
	            T value = current.getValue();

	            current = current.getNext();

	            return value;
			}
            
			return null;
        }
    }

    private Node head;
    private Node tail;

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
        if (head == null || node == null) {
            return;
        }

        Node n = head;

        while (n.getNext() != node) {
            n = n.getNext();
        }

        n.next = node.next;
    }

    public Node search(T val) {
        if (head == null) {
            return null;
        }

        Node node = head;
        
        while (!node.value.equals(val)) {
            node = node.getNext();
        }
        
        return node;
    }

    @Override 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        if (head == null) {
            return "[]";
        }

        sb.append("[");

        Node node = head;

        do {
            sb.append(node.value);
            if (node != tail) {
                sb.append(", ");
            }
            node = node.getNext();
        } while(node != null);

        sb.append("]");

        return sb.toString();
    }
}
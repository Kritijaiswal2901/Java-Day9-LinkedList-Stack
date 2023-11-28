public class SimpleLinkedList<T> implements LinkedList<T> {
    protected Node<T> head;


    @Override
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    @Override
    public void insertAfter(Node<T> prevNode, T data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node<T> newNode = new Node<>(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    @Override
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    @Override
    public void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node<T> secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    @Override
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

@Override
public Node<T> search(T key) {
    Node<T> current = head;
    while (current != null) {
        if (current.data.equals(key) || (key == null && current.data == null)) {
            return current;
        }
        current = current.next;
    }
    return null;
}

    @Override
    public void delete(T key) {
        Node<T> current = head;
        Node<T> prev = null;

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        if (prev == null) {
            head = current.next;
        } else {
            prev.next = current.next;
        }
    }
    @Override
    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public Node<T> getHead() {
        return head;
    }
    

}


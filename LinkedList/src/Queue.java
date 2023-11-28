public class Queue<T> {
    private SimpleLinkedList<T> linkedList;

    public Queue() {
        linkedList = new SimpleLinkedList<>();
    }

    public void enqueue(T data) {
        linkedList.append(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        T front = peek();
        linkedList.deleteFirst();
        return front;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return linkedList.getHead().data;
    }

    public boolean isEmpty() {
        return linkedList.size() == 0;
    }

    public void display() {
        System.out.print("Queue: ");
        linkedList.display();
    }
}


public class Stack<T> {
    SimpleLinkedList<T> linkedList;

    public Stack() {
        linkedList = new SimpleLinkedList<>();
    }

    public void push(T data) {
        linkedList.add(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T top = peek();
        linkedList.deleteFirst();
        return top;
    }

    public boolean isEmpty() {
        return linkedList.size() == 0;
    }


    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return linkedList.getHead().data;

    }

    public void display() {
        System.out.print("Stack: ");
        linkedList.display();
    }
}

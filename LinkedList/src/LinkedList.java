public interface LinkedList<T> {
    void add(T data);

    void append(T data);

    void insertAfter(Node<T> prevNode, T data);

    void deleteFirst();

    void deleteLast();

    void display();

    void delete(T data);

    Node<T> search(T key);
    int size();

    Node<T> getHead();


}


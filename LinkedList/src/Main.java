public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList1 = new SimpleLinkedList<>();
        linkedList1.add(70);
        linkedList1.add(30);
        linkedList1.add(56);
        System.out.print("UC 2 - LinkedList: ");
        linkedList1.display();

        
        LinkedList<Integer> linkedList2 = new SimpleLinkedList<>();
        linkedList2.add(56);
        linkedList2.append(30);
        linkedList2.append(70);
        System.out.print("UC 3 - LinkedList: ");
        linkedList2.display();

        LinkedList<Integer> linkedList3 = new SimpleLinkedList<>();
        linkedList3.add(56);
        linkedList3.append(70);
        linkedList3.insertAfter(linkedList3.search(56), 30);
        System.out.print("UC 4 - LinkedList: ");
        linkedList3.display();

        linkedList3.deleteFirst();
        System.out.print("UC 5 - LinkedList: ");
        linkedList3.display();

        
        linkedList2.deleteLast();
        System.out.print("UC 6 - LinkedList: ");
        linkedList2.display();

        Node<Integer> searchResult = linkedList2.search(30);
        System.out.println("UC 7 - Node found with value 30: " + (searchResult != null));

        LinkedList<Integer> linkedList4 = new SimpleLinkedList<>();
        linkedList4.add(56);
        linkedList4.append(30);
        linkedList4.append(70);
        linkedList4.insertAfter(linkedList4.search(30), 40);
        System.out.print("UC 8 - LinkedList: ");
        linkedList4.display();

        linkedList4.delete(40);
        System.out.print("UC 9 - LinkedList: ");
        linkedList4.display();
        System.out.println("Size after deletion: " + linkedList4.size());

        LinkedList<Integer> sortedLinkedList = new SortedLinkedList<>();
        sortedLinkedList.add(56);
        sortedLinkedList.add(30);
        sortedLinkedList.add(40);
        sortedLinkedList.add(70);
        System.out.print("UC 10 - SortedLinkedList: ");
        sortedLinkedList.display();


        //Stack
          // Use Case 1
          Stack<Integer> stack = new Stack<>();
          stack.push(70);
          stack.push(30);
          stack.push(56);
          System.out.print("UC 1 - Stack: ");
          stack.display();
  
          // Use Case 2
          System.out.println("UC 2 - Popping from the Stack:");
          while (!stack.isEmpty()) {
              System.out.print(stack.pop() + " ");
          }
          System.out.println();


     //Queue
          // Use Case -3
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.print("UC 3 - ");
        queue.display();

        // Use Case 4
        System.out.println("UC 4 - Dequeueing from the Queue:");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
      }
    

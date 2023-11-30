public class Main {
    public static void main(String[] args){
        System.out.println("LINKEDLIST IMPLEMENTATION");

        //create a simple Linked List of 56, 30 and 70
        Linkedlist<Integer> intLinkedlist = new Linkedlist<>();

        intLinkedlist.appendEnd(56);
        intLinkedlist.appendEnd(70);
        intLinkedlist.appendEnd(60);

        intLinkedlist.insertAtPosition(30,1);

        System.out.println("LinkedList after insertion");
        intLinkedlist.printList();  

        System.out.println("\nList after deletion at the end");
        intLinkedlist.deleteLast();
        intLinkedlist.printList();

        Node<Integer> element = intLinkedlist.search(30);
        if (element != null) {
            System.out.println("\nThe element is present in the list.");

        }else{
            System.out.println("\nThe element is absent in the list");
        }

        System.out.println("LinkedList after insertion");
        intLinkedlist.insertAfter(30, 40);
        intLinkedlist.printList(); 
    }
}

public class Main {
    public static void main(String[] args){
        System.out.println("LINKEDLIST IMPLEMENTATION");

        //create a simple Linked List of 56, 30 and 70
        Linkedlist<Integer> intLinkedlist = new Linkedlist<>();

        intLinkedlist.appendEnd(56);
        intLinkedlist.appendEnd(70);

        intLinkedlist.insertAfter(56, 30);

        System.out.println("LinkedList after insertion");
        intLinkedlist.printList();  

        System.out.println("\nList after deletion at the end");
        intLinkedlist.deleteLast();
        intLinkedlist.printList();

    }
}

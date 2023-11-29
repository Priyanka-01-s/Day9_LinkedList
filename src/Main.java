public class Main {
    public static void main(String[] args){
        System.out.println("LINKEDLIST IMPLEMENTATION");

        //create a simple Linked List of 56, 30 and 70
        Linkedlist<Integer> intLinkedlist = new Linkedlist<>();
        Linkedlist<Integer> intLinkedlist2 = new Linkedlist<>();

        intLinkedlist.appendFirst(70);
        intLinkedlist.appendFirst(30);
        intLinkedlist.appendFirst(56);

        System.out.println("Adding elements in the beginning of the list:\n");
        intLinkedlist.printList();  
        
        intLinkedlist2.appendEnd(56);
        intLinkedlist2.appendEnd(30);
        intLinkedlist2.appendEnd(70);

        System.out.println("\nAdding elements in the end of the list:\n");
        intLinkedlist2.printList();  

    }
}

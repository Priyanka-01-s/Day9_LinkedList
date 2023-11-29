public class Main {
    public static void main(String[] args){
        System.out.println("LINKEDLIST IMPLEMENTATION");

        //create a simple Linked List of 56, 30 and 70
        Node<Integer> node1 = new Node<>(56);
        Node<Integer> node2 = new Node<>(30);
        Node<Integer> node3 = new Node<>(70);

        node1.next = node2;
        node2.next = node3;

        Node<Integer> curr = node1;

        while(curr != null){
            System.out.print(curr.data +" ");
            curr = curr.next;
        }

    }
}

public class Linkedlist<T> {

    Node<T> head;

    //constructor to initialise the values
    public Linkedlist(){
        this.head = null;
    }

    //to add elements in the beginning of the list
    public void appendFirst(T data){
        Node<T> curr = new Node<>(data);
        //setting the next of new node to current and current as head
        curr.next = head;
        head = curr;

    }

    //to add elements in the end of the list
    public void appendEnd(T data) {
        Node<T> newNode = new Node<>(data);

        //if the list is empty
        if (head == null) {
            head = newNode;
            return;
        }
        //traverse the list to find the last node
        Node<T> last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    //print the list
    public void printList(){
        Node<T> current = head;

        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
    }
    
    
}

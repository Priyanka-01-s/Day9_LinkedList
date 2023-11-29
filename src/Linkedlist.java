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

    //inserting elements after a specific node
    public void insertAfter(T existingData, T newData) {
        Node<T> newNode = new Node<>(newData);

        //if the list is empty
        if (head == null) {
            return;
        }

        //traverse the list to find the node with existingData
        Node<T> curr = head;
        while (curr != null && !curr.data.equals(existingData)) {
            curr = curr.next;
        }

        //if the node with existingData is found, insert the new node after it
        if (curr != null) {
            newNode.next = curr.next;
            curr.next = newNode;
        }
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

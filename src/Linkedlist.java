public class Linkedlist<T> {

    Node<T> head;

    // constructor to initialise the values
    public Linkedlist() {
        this.head = null;
    }

    // to add elements in the beginning of the list
    public void appendFirst(T data) {
        Node<T> curr = new Node<>(data);
        // setting the next of new node to current and current as head
        curr.next = head;
        head = curr;

    }

    // inserting elements after a specific node
    public void insertAfter(T existingData, T newData) {
        Node<T> newNode = new Node<>(newData);

        // if the list is empty
        if (head == null) {
            return;
        }

        // traverse the list to find the node with existingData
        Node<T> curr = head;
        while (curr != null && !curr.data.equals(existingData)) {
            curr = curr.next;
        }

        // if the node with existingData is found, insert the new node after it
        if (curr != null) {
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

     //method to insert a new node at a specific position in the linked list
     public void insertAtPosition(T data, int position) {
        Node<T> newNode = new Node<>(data);

        //if the position is 0 or negative, insert at the beginning
        if (position <= 0) {
            appendFirst(data);
            return;
        }

        //traverse the list to find the node at the previous position
        Node<T> current = head;
        int currentPosition = 0;
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        //if the position is beyond the end of the list, insert at the end
        if (current == null) {
            appendEnd(data);
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }


    // to add elements in the end of the list
    public void appendEnd(T data) {
        Node<T> newNode = new Node<>(data);

        // if the list is empty
        if (head == null) {
            head = newNode;
            return;
        }
        // traverse the list to find the last node
        Node<T> last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }


    public void deleteLast() {
        // if the list is empty, do nothing
        if (head == null) {
            return;
        }

        // if there is only one node, set head to null
        if (head.next == null) {
            head = null;
            return;
        }

        // traverse the list
        Node<T> secondToLast = head;
        while (secondToLast.next.next != null) {
            secondToLast = secondToLast.next;
        }

        // remove the last node by setting the next of second-to-last node to null
        secondToLast.next = null;
    }

     // Method to delete a specific value from the linked list
     public void deleteAtPos(T value) {
        // If the list is empty, do nothing
        if (head == null) {
            return;
        }

        //update the head to the next node
        if (head.data==value) {
            head = head.next;
            return;
        }

        //traverse the list to find the node with the specified value
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(value)) {
            current = current.next;
        }

        //if the node with the specified value is found, remove it
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    //calculate the size of the linked list
    public int size() {
        int count = 0;
        Node<T> current = head;

        //count each element
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }


    //search elemnet in list 
    public Node<T> search(T data) {
        Node<T> current = head;

        //traverse the list to find the node with the specified value
        while (current != null) {
            if (current.data==data) {
                return current;
            }
            current = current.next;
        }

        return null;
    }
    

    
    // print the list
    public void printList() {
        Node<T> current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

}

public class Node<T> {
    //generic type
    T data;
    Node<T> next;

    //constructor to initialize a node 
    public Node(T data){
        this.data = data;
        this.next = null;
    }
    
}


package listacircularsimple;


public class SinglyLinkedListC {
    
    public Node head = null;
    public Node tail = null;
    
    
    public void add(int data){
    
        Node newNode = new Node(data);
        if(head == null){
        
            head = newNode;
            tail = newNode;
            newNode.next = head;
            
        } else {
        
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    
    public void print(){
        Node current = head;
        if(head == null) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("Nodos de la lista circular: \n");
            
            do {
                System.out.print(current.data+"\t");
                current = current.next;
            } while (current != head);
            
            System.out.println("");
            
        }
        
    }
    
    
    
}

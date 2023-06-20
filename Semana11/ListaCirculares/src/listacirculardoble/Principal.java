
package listacirculardoble;

public class Principal {
    
    public static void main(String[] args) {
        
        DoublyLinkedListC lista = new DoublyLinkedListC();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        
        lista.printHeadTail();
        lista.printTailHead();
        
        
    }
    
}

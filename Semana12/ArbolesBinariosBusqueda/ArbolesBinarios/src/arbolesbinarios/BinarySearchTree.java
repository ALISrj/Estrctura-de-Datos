package arbolesbinarios;

public class BinarySearchTree {

    Node root;

    public Node addRecursive(Node current, int value) {

        if (current==null) {
            return new Node(value);
        }
        
        if (value < current.value) {
            current.left = addRecursive(current.left, value);

        } else if (value > current.value){
            current.right = addRecursive(current.right, value);
        } else {
            System.out.println("Value already exists");
            return current;
        }
        
        return current; //para devolver la raiz
        
     }

    public void add(int value) {
        root = addRecursive(root, value);
    }
    
    private Node deleteRecursive(Node current, int value){
        if (current == null) {
            return null;
        }
        
        if (value == current.value){
            // Cuando el nodo es una hoja
            if (current.left == null && current.right == null) {
                
                return null;
            }
            // Cuando el nodo tiene un hijo
            if (current.right == null) { 
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
            
        }
        
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        
        current.right = deleteRecursive(current.right, value);
        return current;
    }
    
    private int findSmallestValue(Node root){
        return root.left == null?root.value: findSmallestValue(root.left);
    }
    
    public void delete(int value){
        root = deleteRecursive(root, value);
    }
    

}

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

}

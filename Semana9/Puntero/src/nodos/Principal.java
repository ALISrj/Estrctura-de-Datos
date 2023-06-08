package nodos;

public class Principal {

    public static void main(String[] args) {

        Nodo objA = new Nodo(8);
        System.out.println(objA);

        Nodo objB = new Nodo(4);
        System.out.println(objB);

//        Nodo objB = new Nodo(0);
        objA.concatenarMemoria(objB);
        System.out.println("Next A:" + objA.next);

        Nodo objC = new Nodo(11);
        System.out.println(objC);
        objB.concatenarMemoria(objC);

        objA.imprimir();
        objB.imprimir();
        objC.imprimir();
    }
}

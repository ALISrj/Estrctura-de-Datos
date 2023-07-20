package grafos;

public class GrafoNoDirigido {
    private int numVertices;
    private int[][] matrizAdyacencia;

    public GrafoNoDirigido(int n) {
        numVertices = n;
        matrizAdyacencia = new int[numVertices][numVertices];
    }

    public void agregarArista(int origen, int destino) {
        matrizAdyacencia[origen][destino] = 1;
        matrizAdyacencia[destino][origen] = 1;
    }

    public int obtenerValorArista(int origen, int destino) {
        return matrizAdyacencia[origen][destino];
    }

    public int[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
    }
    
    public void presentar(){
        for (int i = 0; i < getMatrizAdyacencia().length; i++) {
            System.out.printf("   %d",i);
        }
        System.out.println("");
        for (int i = 0; i < getMatrizAdyacencia().length; i++) {
            System.out.printf("%d [",i);
            for (int j = 0; j < getMatrizAdyacencia()[i].length; j++) {
                System.out.printf("%d   ",obtenerValorArista(i, j));
            }
            System.out.print("]\n");
        }
    }
    
}

package pruebaparcial12bim;

import java.util.Scanner;

public class DoublyLinkedList {

    class Node {

        String data;
        Node previous;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;

    public void insert(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }

    }

    public void printHeadTail() {

        Node current = head;
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        System.out.println("\nOracion:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public DoublyLinkedList delete(DoublyLinkedList list, String key) {

        Node currentNode = list.head;
        Node prev = null;

        
        
        if (currentNode != null && currentNode.data.equals(key)) {
            if(list.head == list.tail){
                list.head = null;
                list.tail = null;
                System.out.printf("'%s' encontrada y eliminada.",key);
                return list;
            }
            list.head = currentNode.next;
            list.head.previous = null;
            currentNode.next = null;
            System.out.printf("'%s' encontrada y eliminada.",key);
            return list;
        }

        while (currentNode != null && !currentNode.data.equals(key)) {
            prev = currentNode;
            currentNode = currentNode.next;
        }

        System.out.println();

        if (currentNode != null && currentNode == list.tail) {

            list.tail = prev;
            list.tail.next = null;
            currentNode.previous = null;
            return list;
        }

        if (currentNode != null) {

            prev.next = currentNode.next;
            currentNode.next = null;
            prev.next.previous = prev;
            currentNode.previous = null;
            System.out.printf("'%s' encontrada y eliminada.",key);
        }

        if (currentNode == null) {
            System.out.printf("'%s' no encontrada.",key);
        }

        return list;

    }

    public DoublyLinkedList corregir(DoublyLinkedList list, String key) {
        Scanner entrada = new Scanner(System.in);

        Node currentNode = list.head;

        while (currentNode != null && !currentNode.data.equals(key)) {
            currentNode = currentNode.next;
        }

        if (currentNode == null) {
            System.out.printf("\n'%s' no encontrada.\n",key);
            return list;
        }

        System.out.print("\nIngresa tu palabra corregida.\n> ");
        String palabra = entrada.nextLine();

        currentNode.data = palabra;
        System.out.printf("\n'%s' cambiada por '%s'.\n", key, palabra);
        return list;
    }

}

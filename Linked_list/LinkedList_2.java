import java.util.*;
public class LinkedList_2 {
    static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    public static void main(String[] args) {
        System.out.println("Enter the number of nodes");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        Node head = createLinkedList(n, scanner);
        
        System.out.println("Linked List created:");
        printLinkedList(head);

        scanner.close();
    }

    public static Node createLinkedList(int n, Scanner scanner) {
        if (n <= 0) {
            return null;
        }
        
        System.out.println("Enter the elements:");
        int data = scanner.nextInt();
        Node head = new Node(data);
        Node current = head;
        
        for (int i = 1; i < n; i++) {
            data = scanner.nextInt();
            Node newNode = new Node(data);
            current.next = newNode;
            current = current.next;
        }
        
        return head;
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

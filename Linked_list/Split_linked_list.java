// Given a linked list, split it into two sublists – one for the front half 
// and one for the back half. If the total number of elements in the list is odd,
// the extra element should go in the front list.

// For example, list {2, 3, 5, 7, 11} should yield the two lists {2, 3, 5} and {7, 11}.
import java.util.Scanner;

public class Split_linked_list {
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
            Node[] two_nodes=split_linked_list(head);
            Node first_ref=two_nodes[0];
            System.out.println("First half : "); 
            printLinkedList(first_ref);
            Node second_ref=two_nodes[1];
            System.out.println("Second half : "); 
            printLinkedList(second_ref);
            scanner.close();
        }
        public static Node[] split_linked_list(Node head)
        {
            Node slow=head;
            Node fast=head;
            Node First_ref=head;
            while(fast.next!=null&&fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            //slow=slow.next;
            Node Second_ref=slow.next;  //second part linked list head
            slow.next=null; 
            Node curr=First_ref;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            //curr.next=null;
            return new Node[] {First_ref,Second_ref};
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

import java.util.Scanner;

public class Sort_0s_1s_2s {
    static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        Node() {}
    }
        public static void main(String[] args) {
            System.out.println("Enter the number of nodes");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            
            Node head = createLinkedList(n, scanner);
            
            System.out.println("Linked List created:");
            printLinkedList(head);
            head=sort_0s_1s_2s(head);
            printLinkedList(head);

            scanner.close();
        } 
        public static Node sort_0s_1s_2s(Node head)
        {
            if(head==null||head.next==null)
                return head;
            Node first=new Node(); Node zero=first;    
            Node second=new Node();  Node one=second;  
            Node three=new Node();  Node two=three;  
            Node curr=head; 
            while(curr!=null)
            {
                if(curr.data==0)
                {
                    zero.next=curr; 
                    zero=zero.next;
                }
                if(curr.data==1)
                {
                    one.next=curr; 
                    one=one.next;
                }
                if(curr.data==2)
                {
                    two.next=curr; 
                    two=two.next;
                }
                curr=curr.next;
            }
            if(second.next!=null)
                zero.next=second.next; //caause Second=new Node()
            else
                zero.next=three.next;
            one.next=three.next;
            two.next=null;    
            return first.next;
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

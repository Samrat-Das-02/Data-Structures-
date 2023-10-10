//import java.util.*;
 
class linkedList {
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single-node list is considered a palindrome
        }
        
        // Step 1: Find the middle of the linked list
        Node slow = head;
        Node fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node current = slow.next;
        
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        // Step 3: Compare the first half with the reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;
        
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        return true;
    }
    public static void main(String args[])
    {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        boolean condition = isPalindrome(one);
        System.out.println("isPalidrome :" + condition);
    }
}
    class Node {
    int val;
    Node next;
    Node(int d)
    {
        next = null;
        val = d;
    }
}

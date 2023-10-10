import java.util.*;
public class LinkedListJava {
    public static void main(String[] args){
        LinkedList<Integer>list=new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.addFirst(5);
        list.addLast(6);
        list.add(3,7);
        System.out.println(list);
        //Making a clone of the Linked list 
        LinkedList<Integer>duplicate = new LinkedList<Integer>();
        duplicate=(LinkedList)list.clone();
        System.out.println(duplicate);
        //List sorting 
        Collections.sort(duplicate);
        System.out.println("Original list : " + list);
        System.out.println("Sorted list : " + duplicate);

    }
}

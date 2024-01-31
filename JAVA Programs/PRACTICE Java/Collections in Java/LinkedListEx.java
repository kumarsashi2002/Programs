import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String args[]){
        LinkedList <Integer> ll=new LinkedList <>();
        ll.add(54);
        ll.add(36);
        ll.add(42);
        ll.add(96);
        ll.add(36); // It allows duplicate values
        System.out.println("Linkedlist Elements are: "+ll);

        // ll.remove(54); // Error
        ll.remove();
        System.out.println("Linkedlist Elements are: "+ll);

        System.out.println(ll.contains(54)); 

        if(ll.contains(36)){
            System.out.println("Yes it contains");
        }

        if(ll.contains(10)==false){
            ll.add(10);
            System.out.println("10 added: "+ll);
        }

        System.out.println(ll.isEmpty());

        ll.clear();
        System.out.println("After clear the LinkedList: "+ll);
    }
}

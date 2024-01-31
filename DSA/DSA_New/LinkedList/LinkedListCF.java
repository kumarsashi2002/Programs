import java.util.*;
// import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListCF {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList <Integer> al = new ArrayList<>();


    /* Insertions methods */
        al.add(11); al.add(22); al.add(33); al.add(44); al.add(55);
        ll.add(1); // Inserts at last 
        ll.add(4);
        ll.addFirst(2);  // Insert at first
        ll.addLast(3);   // Insert at last
        ll.add(1, 4);
        ll.addAll(al); // It inserts the other collection to the end of ll
        // ll.addAll(2, al);  // It inserts other collection at the given index in the ll

        // ll.offer(100);  // It inserts at last Learn more
        // ll.offerFirst(200);
        // ll.offerLast(300);


/* Removing methods */
        // // ll.remove();  // It removes the first element from the list
        // // ll.remove(4); // It removes the element at the given index
        // // ll.removeFirst(); // It removes the first element
        // // ll.removeLast(); // It removes the last element
        // ll.removeFirstOccurrence(4);  // It removes the first occurence of element in ll
        // ll.removeLastOccurrence(44);  // It removes the last occurence of element
        // ll.removeAll(al); // It removes all the matching elements of collection in ll

        // System.out.println(ll.poll());  // It retrieves and remove the first element.. (Queue based Working)
        // System.out.println(ll.pollFirst());
        // System.out.println(ll.pollLast());  // It retrieves and remove the last element



/* Getting elements */
        // System.out.println(ll.get(2));  // It returns the element at the given index
        // System.out.println(ll.getFirst());  // It returns the first element of ll
        // System.out.println(ll.getLast());  // It returns the last element of ll
        // System.out.println(ll.getClass());  // It returns the class of the list/collection

        // System.out.println(ll.peek());  // It return the first element without removing
        // System.out.println(ll.peekFirst());
        // System.out.println(ll.peekLast());  // it returns tha last element

        // System.out.println(ll.indexOf(4)); // It returns the index of first occurence of the given element
        // System.out.println(ll.indexOf(999));
        // System.out.println(ll.lastIndexOf(4));  // It returns the index of last occurence of given element



/* Replace element */
        ll.set(0, 236);  // It will replace the old value at given index. And returns the old value

/* Find size of ll */
        System.out.println(ll.size());

/* Clear the ll */
        // ll.clear();

/* Copy the ll  */
        // LinkedList <Integer> ll2 = new LinkedList<>();
        // ll2 = (LinkedList) ll.clone();
        // System.out.println(ll2);

/* Check availability of element in ll */
        // System.out.println(ll.contains(4));  // It will return if given value is present in ll else false
        // System.out.println(ll.containsAll(al));  // It will return true if all elements of the collection is present in ll

/* Converting into Array or String */
        

/* Iterate in reverse order */
        Iterator itr = ll.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        // System.out.println();

/* Linked list representation of  Stack methods*/
        // ll.push(333);  // It will insert element at top of stack or at start of ll
        // ll.pop();  // It will remove the element from top of stack or first element from ll
        // System.out.println(ll.peek());  // It will retrieve the top of stack or first element of ll without removing
        


        System.out.println(ll);
    }
}

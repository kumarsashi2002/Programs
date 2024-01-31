import java.util.*;

public class VectorEx {
    public static void main(String args[]){
        Vector <String> v1=new Vector<>();
        Vector <Integer> v2=new Vector <>();
        // v2.add(23);
        // v2.add(03);
        // v2.add(67);
        // v2.add(19);
        // System.out.println("Vector Elements are: "+v2);

        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");

        


        //======== Enhanced for loop to display the content(It can be used as itertor)
        System.out.println("Print elements using for-each loop:");
        for(String x : v1){
            System.out.println("====="+x); 
        } 


        //======== Adding element at a specific index
        v1.add(0,"Z");
        System.out.println("After adding element at an index: "+v1);


        //======== Removing element from an given index(Using Index value)
        v1.remove(4);
        System.out.println("After removing element at an index: "+v1);
        

        //======== Removing element by using the value directly
        v1.remove("Z");
        System.out.println("After removing the value: "+v1);


        //======== Access element directly
        System.out.println("Element at index 1 is: "+v1.get(1));


        //======== To get The index of an element
        System.out.println("Index of C is: "+v1.indexOf("C"));


        //======== Replace element 
        String x=v1.set(2,"xyz");
        System.out.println("Replacing 3rd element by xyz ");


        // //======== Sort the elements
        // System.out.println(Collections.sort(v1));
        // System.out.println(v1);
        

        //======== To check if an element is present or not
        System.out.println("A is present in the list: "+v1.contains("A"));
        System.out.println("mno is present in the list: "+v1.contains("mno"));


        //======== Cloning Vector    
        Vector<String> v1Clone = (Vector<String>) v1.clone();
        System.out.println("Cloned Vector is: "+v1Clone);


        //======== To check a list is empty or not
        System.out.println("Check if the list is empty or not: "+v1.isEmpty());


        //======== To create a sublist from the list(Last index excluded)
        System.out.println("Sublist from index 0 and 1 is: "+v1.subList(0,2));


        System.out.println("Vector v1 is: "+v1);
        System.out.println("Current Size of Vector v1 is: "+v1.size());
        System.out.println(v1);

        /* // Different methods for iterating in vector // */
        // //======== Use Iterator to display contents of list(it can be used for list,set,map)
        // Iterator <String> itr= v1.iterator();
        // System.out.println("Iterator method used:");
        // while(itr.hasNext()){
        //     System.out.println(":"+itr.next());
        // }
        

        // //======== Use ListIterator to display contents of list(it can only be used for the list)
        // System.out.println("ListIterator method Used here:");
        // ListIterator <String> litr=v1.listIterator();
        // while(litr.hasNext()){
        //     System.out.println(":: "+litr.next());
        // }
        // //To display the contents in backwards, listIterator can be used only(iterator can't be used) 
        // System.out.println("Print Elements in backwards:");
        // while(litr.hasPrevious()){
        //     System.out.println(":::: "+litr.previous());
        // }

    }
}



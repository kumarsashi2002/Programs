import java.util.*;

class ArrayListEx{
    public static void main(String args[]){
        //ArrayList a=new ArrayList();
        // ArrayList<Integer> a1=new ArrayList<>();
        // System.out.println("Initial capacity is: "+a1.size());
        // a1.add(1);
        // a1.add(5);
        // a1.add(7);
		// a1.add(8);
        // System.out.println("After adding elements in arraylist: "+a1);
        // //====== Adding at a specific index
        // a1.add(2,25);
        // //====== Removing element from an given index(Using index value)
        // a1.remove(1);
        // System.out.println(a1);
        // System.out.println("Initial capacity is: "+a1.size());

        
        ArrayList<String> a2=new ArrayList<String>();
        a2.add("A");
        a2.add("B");
        a2.add("C");
        a2.add("D");
        System.out.println("ArrayList a2 Elements are:"+a2);


        //======== Use Iterator to display contents of list(it can be used for list,set,map)
        Iterator <String> itr= a2.iterator();
        System.out.println("Iterator method used:");
        while(itr.hasNext()){
            System.out.println(":"+itr.next());
        }
        

        //======== Use ListIterator to display contents of list(it can only be used for the list)
        System.out.println("ListIterator method Used here:");
        ListIterator <String> litr=a2.listIterator();
        while(litr.hasNext()){
            System.out.println(":: "+litr.next());
        }
        //To display the contents in backwards, listIterator can be used only(iterator can't be used) 
        System.out.println("Print Elements in backwards:");
        while(litr.hasPrevious()){
            System.out.println(":::: "+litr.previous());
        }


        //======== Enhanced for loop to display the content(It can be used as itertor)
        System.out.println("Print elements using for-each loop:");
        for(String x : a2){
            System.out.println("====="+x); 
        } 


        //======== Adding element at a specific index
        a2.add(0,"Z");
        System.out.println("After adding element at an index: "+a2);


        //======== Removing element from an given index(Using Index value)
        a2.remove(4);
        System.out.println("After removing element at an index: "+a2);
        

        //======== Removing element by using the value directly
        a2.remove("Z");
        System.out.println("After removing the value: "+a2);


        //======== Access element directly
        System.out.println("Element at index 1 is: "+a2.get(1));


        //======== To get The index of an element
        System.out.println("Index of C is: "+a2.indexOf("C"));


        //======== Replace element 
        String x=a2.set(2,"xyz");
        System.out.println("Replacing 3rd element by xyz ");


        // //======== Sort the elements
        // System.out.println(Collections.sort(a2));
        // System.out.println(a2);
        

        // //======== To check if an element is present or not
        // System.out.println("A is present in the list: "+a2.contains("A"));
        // System.out.println("mno is present in the list: "+a2.contains("mno"));


        // //======== Cloning Arraylist    
        // ArrayList<String> a2Clone = (ArrayList<String>) a2.clone();
        // System.out.println("Cloned Arraylist is: "+a2Clone);


        // //======== To check a list is empty or not
        // System.out.println("Check if the list is empty or not: "+a2.isEmpty());


        // //======== To create a sublist from the list(Last index excluded)
        // System.out.println("Sublist from index 0 and 1 is: "+a2.subList(0,2));


        // System.out.println("ArrayList a2 is: "+a2);
        // System.out.println("Current Size of Arraylist a2 is: "+a2.size());
        
    }
}




/*      // ArrayList Summary

ArrayList <String> a1=new ArrayList<>();

Iterator itr=a1.iterator();  //==while(itr.hasNext())      //==SOP(itr.next())

ListIterator litr=a1.listiterator();



a1.add(x);
a1.add(0,"z");;
a1.size();
a1.remove();
a1.remove("z");
a1.get(0);
a1.indexOf("A");
a1.set(2,"xyz");
a1.contains("A");
a1.subList(0,2);
a1.isEmpty();



*/
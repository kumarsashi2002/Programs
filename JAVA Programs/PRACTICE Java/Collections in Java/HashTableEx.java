import java.util.Hashtable;

public class HashTableEx {
    public static void main(String args[]){
        Hashtable <Integer, String> ht = new Hashtable<>();
        ht.put(1,"KSS");
        ht.put(2,"Gaurav");
        ht.put(3,"abc");
        ht.put(4,"xyz");
        
        System.out.println(ht);

        ht.put(1,"Dutta"); // Key cannot be duplicated . But Value will be updated.
        ht.put(5,"abc");  // Doesn't allow duplicate keys But allow Duplicate values
        System.out.println(ht);


        System.out.println("value of key 2 is: "+ht.get(2));  // It returns the corresponding value of the key
        System.out.println("Value of key 6 is:"+ ht.getOrDefault(6, "KSS"));   // It returns the value of key But if key is not present in hashtable then it returns the default value written

        System.out.println("After removing: "+ht.remove(4)); 

        if(ht.contains(1)==true){
            System.out.println("Yes it contains");
        }
        System.out.println("Final: "+ht);
        
    }
}
//=======================================================================================
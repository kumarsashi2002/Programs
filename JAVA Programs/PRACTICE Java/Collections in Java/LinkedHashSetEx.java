import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet <Integer> lhs = new LinkedHashSet<>();
        lhs.add(54);
        lhs.add(36);
        lhs.add(42);
        lhs.add(95);
        lhs.add(54);  // It does not allow duplicate values
        System.out.println("LinkedHashSet elements are: " +lhs);

        lhs.remove(54);
        System.out.println("After removing 54: "+lhs);

        System.out.println(lhs.contains(36));

        if(lhs.contains(36)){
            System.out.println("Yes it contains");
        }

        if(lhs.contains(10)==false){
            lhs.add(10);
            System.out.println("After adding 10: "+lhs);
        }

        if(!lhs.contains(00)){
            System.out.println("Not contains");
        }

        System.out.println("Check Empty: "+lhs.isEmpty());

        lhs.clear();
        System.out.println("After clear the LinkedHashSet: "+lhs);
    }
}

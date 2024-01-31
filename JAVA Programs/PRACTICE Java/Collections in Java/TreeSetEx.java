import java.util.TreeSet;

import javax.swing.event.SwingPropertyChangeSupport;

public class TreeSetEx {
    public static void main(String args[]){
        // TreeSet<Integer> ts=new TreeSet<>();
        // ts.add(21);
        // ts.add(54);
        // ts.add(87);
        // ts.add(40);
        // ts.add(54);  // It will not add in Treeset beacuse it doesnot contains duplicate values
        // System.out.println("TreeSet Elements are: "+ts);

        TreeSet <String> ts=new TreeSet<>();
        ts.add("Vehicle");
        ts.add("Car");
        ts.add("Car");
        out.format("%s",ts);

        // ts.remove(54);
        // System.out.println(ts);

        // System.out.println(ts.contains(87));
        // System.out.println(!ts.contains(22));

        // if(ts.contains(87)){
        //     System.out.println("Yes it contains");
        // }
        // if(!ts.contains(87)){
        //     System.out.println("No");
        // }

        // if(ts.contains(10)==false){
        //     ts.add(10);
        //     System.out.println("10 added in Treeset");
        // }

        // // // Subset of a treeSet
        // // ts.add(200);
        // // ts.add(48);
        // // ts.add(100);
        // // System.out.println("Subset is:" +ts.subSet(21, 300));

        // System.out.println("Check Empty: "+ts.isEmpty());
        // ts.clear();
        System.out.println("After clear the  Treeset: "+ts);
    }
}

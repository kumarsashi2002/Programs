import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String args[]){
        HashSet <Integer> hs=new HashSet <Integer>();
        //Set <Integer> hs = new HashSet<>();
        // hs.add(65);
        // hs.add(34);
        // hs.add(90);
        // hs.add(12);
        // hs.add(65); // It will not add 65 because it does not contain duplicate values 
        // System.out.println("Hashset Elements are: "+hs);

        
        // hs.remove(65);
        // System.out.println("After removing : "+hs);

        // boolean a= hs.contains(34);
        // System.out.println(hs.contains(65)+" "+a);

        // if(hs.contains(34)){
        //     System.out.println("Yes it Contains");
        // }

        // if(!hs.contains(69)){
        //     System.out.println("No");
        // }


        // if(hs.contains(10)==false){
        //     hs.add(10);
        //     System.out.println("10 added in hashset");
        // }

        
        // System.out.println(hs.isEmpty());

        // hs.clear();
        // System.out.println(hs);
        
        int arr[]={4,1,2,1,2};
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                hs.remove(arr[i]);
                System.out.println("YY");
            }else{
                hs.add(arr[i]);
                System.out.println("NN");
            }
        }
        //System.out.println(hs);
        for(int i:hs){
            System.out.println("After clear the hashset: "+hs+"....."+i);
        }
        

        // System.out.println("After clear the hashset: "+hs);
        
        
    }
}

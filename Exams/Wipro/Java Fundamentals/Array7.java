import java.util.HashSet;

public class Array7 {
    public static void main(String[] args) {
        int arr[]={3,5,9,5,6,7,9};
        HashSet <Integer> hs = new HashSet<>();
        for(int val:arr){
            if(!hs.contains(val)){
                hs.add(val);
            }
        }
        System.out.println(hs);
        
    }
}

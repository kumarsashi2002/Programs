import java.util.*;

public class Jayant1 {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        HashSet <Integer> hs =new HashSet<>();
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<N;i++){
            if(hs.contains(arr[i])){
                hs.remove(arr[i]);
            }
            else{
                hs.add(arr[i]);
            }
        }
        for(int val:hs){
            System.out.println(val);
        }
        
    }

}

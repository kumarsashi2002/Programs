import java.util.*;
public class Kartik2 {
    public static void main(String[] args) {
        // int[] arr={10,9,8,7,6,5,4,3,2,1};
        int[] arr={20,1,50,30,2,60,40,3,70,0};
        int n=arr.length;
        int k=5;
        int arr2[]=new int[k];
        for(int i=0;i<k;i++){
            arr2[i]=arr[i];
        }
        Arrays.sort(arr2);
        for(int i=0;i<k;i++){
            arr[i]=arr2[i];
        }
        for(int val:arr){
            System.out.print(val);
        }
        //System.out.println(arr.toString());
    }
}

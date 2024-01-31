import java.util.HashSet;

public class RichaR {
    static int totalPrice(int[] arr, int n){
        int sum=0;
        HashSet <Integer> hs =new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        for(int val:hs){
            sum=sum+val;
        }
        return sum;
    }

    public static void main(String[] args) {
        // int[] arr={10,20,30,40,10,20};
        int[] arr={11,223,23,124,121,11,23,12,24};
        int n=arr.length;
        System.out.println(totalPrice(arr, n));

    }
}

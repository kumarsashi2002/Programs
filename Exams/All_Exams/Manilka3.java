import java.util.Arrays;

public class Manilka3 {
    public static void main(String[] args) {
        // int[] arr={1,1,1,1};
        // int[] arr={3,4,5,2,1,1};
        int[] arr={1,2,3,4,5,6};
        int k=4;
        int count=0;
        // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-i-1;j>i;j--){
                if(Math.abs(arr[j]-arr[i])>=k && i!=j /*&& (arr[i]!=-1 && arr[j]!=-1)*/){
                    count++;
                    // arr[i]=-1;
                    // arr[j]=-1;
                }
            }
        }
        System.out.println(count);
    }
}

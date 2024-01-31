import java.util.Arrays;

public class ReverseArray {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        ReverseArray obj = new ReverseArray();
        obj.reverse(nums);
    }
    void reverse(int arr[]){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}

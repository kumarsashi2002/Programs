/* To Check an Array is Sorted or not */
public class CheckSortedArray {
    public static boolean iterativeCheck(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    } 

    static boolean recursiveCheck(int[] arr, int i){
        //int i=0;
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }
        return recursiveCheck(arr,i+1);
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        CheckSortedArray obj=new CheckSortedArray();
        //System.out.println(obj.iterativeCheck(arr));
        System.out.println(recursiveCheck(arr, 0));
    }
}

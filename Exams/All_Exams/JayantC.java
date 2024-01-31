public class JayantC {
    public static void main(String[] args) {
        // int arr[]={3,7,6,9,7,8,6};
        int arr[]={3,5,8,8,7,6};
        int size_of_array=arr.length;
        System.out.println(check(arr,size_of_array));

    }
    static String check(int arr[], int size_of_array){
        String result_str="Yes";
        for(int i=0;i<size_of_array/2;i++){
            if(arr[i]>arr[i+1]){
                result_str="No";
                return result_str;
            }
        }
        for(int i=size_of_array/2+1;i<size_of_array-1;i++){
            if(arr[i]<arr[i+1]){
                result_str="No";
                return result_str;
            }
        }
        return result_str;
    }
}

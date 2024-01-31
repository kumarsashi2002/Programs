public class Array2 {
    public static void main(String[] args) {
        int arr[]={10,26,32,8,16};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum value is :"+max);
        System.out.println("Minimum value is: "+min);
    }
}

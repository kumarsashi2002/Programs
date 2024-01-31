public class Array5 {
    public static void main(String[] args) {
        int arr[]={10,26,98,8,19,46};
        int max=arr[0];
        int max2=0;
        int min=arr[0];
        int min2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]<min){
                min2=min;
                min=arr[i];
            }
        }
        System.out.println("Largest Two elements are: "+max+","+max2);
        System.out.println("Smallest Two are: "+min+","+min2);
    }
}

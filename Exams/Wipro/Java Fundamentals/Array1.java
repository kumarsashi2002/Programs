public class Array1 {
    public static void main(String[] args) {
        int arr[]={12,54,05,69,32};
        int sum=0;
        for(int val:arr){
            sum=sum+val;
        }
        int average=sum/arr.length;
        System.out.println("Sum is: "+sum );
        System.out.println("Average is: "+average);
    }
}

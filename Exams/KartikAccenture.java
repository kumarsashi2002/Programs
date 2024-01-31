public class KartikAccenture {
    public static int Sum(int[] arr, int len, int n){
        if(len==0){
            return -1;
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if((i+1)%n==0){
                ans=ans+arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int[] arr={7,88,12,4,15,71,22,23,20,16};
        int[] arr={10,12,16,1,5,6,3,21};
        int len=arr.length;
        int n=4;
        int ans=Sum(arr,len,n);
        System.out.println(ans);
    }
}

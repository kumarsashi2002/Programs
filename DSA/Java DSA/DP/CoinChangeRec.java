public class CoinChangeRec {
    public static void main(String args[]){
        int[] arr={1,2,5};
        int sum=11;
        int ans=minCoins(arr, sum);
        System.out.println(ans);
    }

    static int minCoins(int arr[], int sum){
        if(sum==0){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sum-arr[i]>=0){
                int subAns=minCoins(arr, sum-arr[i]);
                if(subAns+1<ans){
                    ans=subAns+1;
                }
            }
        }
        return ans;
    }
}

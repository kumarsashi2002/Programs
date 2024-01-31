import java.util.Arrays;

public class CoinChangeDp {
    public static void main(String args[]) {
        int[] arr={7,1,5};
        int sum=18;
        int[] dp=new int[sum+1];
        Arrays.fill(dp, -1);
        dp[0]=0;
        int ans=minCoins(arr,sum,dp);
        System.out.println(ans);
        
    }

    static int minCoins(int[] arr, int sum, int[] dp){
        if(sum==0){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sum-arr[i]>=0){
                int subAns=0;
                if(dp[sum-arr[i]]!=-1){
                    subAns=dp[sum-arr[i]];
                }else{
                    subAns=minCoins(arr, sum-arr[i], dp);
                }
                if(subAns<ans){
                    ans=subAns+1;
                }
            }
        }
        return ans;
    }
}

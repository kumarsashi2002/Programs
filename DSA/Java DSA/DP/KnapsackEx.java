public class KnapsackEx {
    public static void main(String args[]){
        int[] value={1,2,3};
        int[] wt={4,5,1};
        int m=value.length;
        int capacity=4;
        int[][] dp=new int[m+1][capacity+1];
        for(int i=0;i<=capacity;i++){
            dp[0][i]=0;
        }
        for(int j=0;j<=m;j++){
            dp[j][0]=0;
        }
        int ans = maxProfit(value, wt, m, capacity, dp);
        System.out.println(ans);
    }

    static int maxProfit(int[] value, int[] wt, int m, int capacity, int[][] dp){
        for(int item=1; item<=m; item++){
            for(int cap=1; cap<=capacity; cap++){
                int maxValWithoutCurr = dp[item-1][cap];
                int maxValWithCurr = 0;
                int weightOfCurr = wt[item-1];
                if(cap>=weightOfCurr){
                    //maxValWithCurr=value[item-1];
                    int remCap = cap-weightOfCurr;
                    maxValWithCurr = value[item-1]+dp[item-1][remCap];
                }
                dp[item][cap] = Math.max(maxValWithoutCurr, maxValWithCurr);
            }
        }
        return dp[m][capacity];
    }
}

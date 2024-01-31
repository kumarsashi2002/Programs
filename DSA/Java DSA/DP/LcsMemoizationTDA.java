/* === Longest Common Subsequences === Using Memoization (Top down Approach)*/

public class LcsMemoizationTDA {
    public static void main(String args[]){
        String s1="Replacement";
        String s2="Substitute";
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int [m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        int ans=lcs(s1,s2,m,n,dp);
        System.out.println(ans);
    }

    static int lcs(String s1, String s2, int m, int n, int dp[][]){
        if(m==0 || n==0){
            return 0;
        }
        
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        else if(s1.charAt(m-1)==s2.charAt(n-1)){
            dp[m][n]=1+lcs(s1,s2,m-1,n-1,dp);
            return dp[m][n];
        }else{
            dp[m][n]=Math.max(lcs(s1,s2,m,n-1,dp), lcs(s1,s2,m-1,n,dp));
            return dp[m][n];
        }
        //return dp[m][n];
    }
}

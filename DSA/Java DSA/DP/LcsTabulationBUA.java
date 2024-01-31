/* === Longest Common Subsequences === Using Tabulation (Bottom Up Approach) */

public class LcsTabulationBUA {
    public static void main(String args[]){
        String s1="Shashi";
        String s2="Shekhar";
        int m=s1.length();
        int n=s2.length();
        int [][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        int ans=lcs(s1,s2,m,n,dp);
        System.out.println(ans);
    }
    static int lcs(String s1, String s2, int m, int n, int[][] dp){

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }
    static int max(int a, int b){
        return (a>b)?a:b;
    }
}

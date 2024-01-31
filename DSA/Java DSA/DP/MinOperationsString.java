import java.util.Arrays;

public class MinOperationsString {
    public static void main(String[] args) {
        String s1="Mayank";
        String s2="Nayan";
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        int ans=minOperation(s1, s2, m, n, dp);
        System.out.println(ans);
    }
    static int minOperation(String s1, String s2, int m, int n, int[][] dp){
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    //dp[i][j]=1+min(dp[i][j-1], dp[i-1][j], dp[i-1][j-1]);
                    dp[i][j]=1+Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    // static int min(int a, int b, int c){
    //     if(a<b && a<c){
    //         return a;
    //     }else if(b<a && b<c){
    //         return b;
    //     }else{
    //         return c;
    //     }
    // }
}

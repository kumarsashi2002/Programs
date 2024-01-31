/* ==========   Longest Common Subsequences using Recursion ======  (Bottom Up Approach) */

public class LcsRec {
    public static void main(String args[]){
        String s1="Kumari";
        String s2="Madhuranjani";
        int m=s1.length();
        int n=s2.length();
        int ans=lcs(s1,s2,m,n);
        System.out.println(ans);

        // char[] c1=s1.toCharArray();
        // char[] c2=s2.toCharArray();
        // int ans2=lcs2(c1,c2,m,n);
        // System.out.println(ans2);

    }

    static int lcs(String s1, String s2, int m, int n){
        if(m==0 || n==0){
            return 0;
        }
        else if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+lcs(s1,s2,m-1,n-1);
        }
        else{
            return Math.max(lcs(s1,s2,m-1,n), lcs(s1,s2,m,n-1));
        }
    }



    /* 2nd Method- By converting the strings into character array and using using it in the method */
    static int lcs2(char[] c1, char[] c2, int m, int n){
        if(m==0 || n==0){
            return 0;
        }
        else if(c1[m-1]==c2[n-1]){
            return 1+lcs2(c1,c2,m-1,n-1);
        }
        else{
            return Math.max(lcs2(c1,c2,m,n-1),lcs2(c1,c2,m-1,n-1));
        }
    }
}

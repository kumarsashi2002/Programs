public class PrintPermutations2 {
    

    static void printAll(String s){
        int n=s.length();
        int f=factorial(n);
        StringBuilder sbr =new StringBuilder(s);
        
        for(int i=0;i<f;i++){
            int temp=i;
            for(int div=n;div>=1;div--){
                int q = temp/div;
                int r = temp%div;
                System.out.println(sbr.charAt(r));
                sbr.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }
    }

    static int factorial(int n){
        int ans=1;
        for(int i=2;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String args[]){
        String s="abc";
        printAll(s);
    }
}

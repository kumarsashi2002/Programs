import java.math.BigInteger;
import java.util.*;
public class KvFactorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        BigInteger ans;
        ans=factorial(x).subtract(factorial(y));
        System.out.println(ans);
    }
    static BigInteger factorial(int n){
        BigInteger fact= BigInteger.ONE;
        if(n==1){
            return BigInteger.valueOf(n);
        }
        else if(n>1){
            for(int i=2;i<=n;i++){
                fact=fact.multiply(BigInteger.valueOf(i));
            }
            return fact;
        }else{
            return BigInteger.valueOf(-1);
        }
    }
}

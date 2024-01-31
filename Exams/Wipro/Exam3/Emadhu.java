
import java.util.*;
public class Emadhu{

    // public String transformCodes(int arr1[]){

    // }

    static int SumOfDigits(int n){
        int sum=0;
        int n1=n;
        while(n1>0){
            int rem=n1%10;
            sum=sum+0;
            n1=n1/10;
        }
        if(sum<=9){
            return sum;
        }else{
            return SumOfDigits(sum);
        }
    }

    public static void main(String args[]){
        Emadhu obj = new Emadhu();
        int arr1[]={123456,56};
        String ans="";
        int number1=arr1[0];
        //String num1=number1.toString();
        String num1=String.valueOf(number1);
        int len=num1.length();
        if(len==6){
            ans=ans+"C";
        }else{
            ans=ans+"W";
        }

        int n=arr1[0];
        if(n==0){
            ans=ans+"Z";
        }
        else if(n==1){
            ans=ans+"O";
        }else{
            boolean flag = true;
            if(n < 2){
                ans=ans+"N";
            }else{
                for(int i=2;i<=n/2;i++){
                    if(n%i == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    ans=ans+"N";
            }
        }

        obj.SumOfDigits(n);
        ans=ans+"sum";

        if(n%2==0){
            ans=ans+n/2;
        }else{
            ans=ans+(n-1)/2;
        }
        }
    }
}

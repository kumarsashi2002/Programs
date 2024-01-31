import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        //int num=153;
        int n=num;
        int len=0;
        double ans=0;
        while(n!=0){
            n=n/10;
            len++;
        }
        n=num;
        for(int i=0;i<len;i++){
            int rem=num%10;
            ans=ans+Math.pow(rem, len);
            num=num/10;
        }
        if(n==ans){
            System.out.println(n+" is an Armstrong Number.");
        }else{
            System.out.println(n +" is not an Armstrong Number.");
        }
    }
}

import java.util.Scanner;

public class While17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int value=num;
        int rev=0;
        while(num>0){
            int x=num%10;
            rev=rev*10+x;
            num=num/10;
        }
        if(value==rev){
            System.out.println(value +" is a Palindrome");
        }else{
            System.out.println(value + " is not a Palindrome");
        }
    }
}

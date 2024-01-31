import java.util.Scanner;

public class For14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int sum=0;
        for(;;){
            int x=num%10;
            sum=sum+x;
            num=num/10;
            if(num==0){
                break;
            }
        }
        System.out.println("Sum of digits of num is: "+sum);
    }
}

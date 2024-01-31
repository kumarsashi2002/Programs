import java.util.Scanner;

public class If1b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers to compare:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%10==b%10){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    }
}

import java.util.Scanner;
public class If1a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("positive Number");
        }else if(a==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }
}

import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Prime or not:");
        int a=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                flag=true;
                break;
            }
        }if(flag){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime Number");
        }
    }
}

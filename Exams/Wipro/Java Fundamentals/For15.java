import java.util.Scanner;

public class For15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        for(int i=0;i<=x;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
            
        }
    }
}

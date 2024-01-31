import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two characters:");
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        int a1=a;
        int b1=b;
        if(a1>b1){
            System.out.println(a+","+b);
        }else{
            System.out.println(b+","+a);
        }
    }
}

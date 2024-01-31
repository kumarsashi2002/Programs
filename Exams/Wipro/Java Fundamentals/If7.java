import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet character:");
        char value=sc.next().charAt(0);
        int ascii1=value;
        char newch;
        if(ascii1>=65 && ascii1<=90){
            newch=(char)(ascii1+32);
            System.out.println(value+"->"+newch);
        }else if(ascii1>=97 && ascii1<=122){
            newch=(char)(ascii1-32);
            System.out.println(value+"->"+newch);
        }
    }
}

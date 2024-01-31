import java.lang.*;
import java.util.Scanner;
public class PrintString{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scan.nextLine();
        System.out.println("Enter the Character: ");
        char ch = scan.nextLine().charAt(0);
        System.out.println("Enter the value of count: ");
        int count = scan.nextInt();

        String ans="";
        int ch_count = 0;
        int i=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i) == ch){
                ch_count++;
                if(ch_count == count){
                    break;
                }
            }
        }

        while(i<str.length()-1){
            ans = ans+str.charAt(i+1);
            i++;
        }
        System.out.println(ans);
    }
}
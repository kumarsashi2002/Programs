import java.util.Scanner;
public class Monika1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){

            }else{
                ans=ans + String.valueOf(c);
            }
        }
        System.out.println(ans);
    }
}

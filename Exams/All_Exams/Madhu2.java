import java.util.*;
public class Madhu2 {
    public static void main(String[] args) {
        int num=4756;
        String s=String.valueOf(num);

        StringBuilder ans="";
        for(int i=1;i<=s.length();i++){
            ans=ans.charAt(n-i)+ans;
        }
    }
    static String reverse(String str){
        StringBuilder sbr=new StringBuilder(str);
        sbr.reverse();
        return sbr.toString();
    }
}

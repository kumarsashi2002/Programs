public class ReverseString {
    public static void main(String[] args) {
        String s="Gaurav";
        //StringBuilder sbr=new StringBuilder();
        String s1="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            s1=s1+c;
            //sbr.append(c);
        }
        System.out.println(s1);
    }
}

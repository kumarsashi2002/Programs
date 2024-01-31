public class PrintPemutations {
    
    static void printAll(String s1, String ans){
        if(s1.length()==0){
            System.out.println(ans);
        }

        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            String lpart=s1.substring(0, i);
            String rpart=s1.substring(i+1, s1.length());
            String total=lpart+rpart;
            printAll(total, ans+c);
        }
    }
    
    public static void main(String args[]){
        String s1="mayank";
        String ans="";
        printAll(s1, ans);
    }
}

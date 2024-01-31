public class Gamma{

    public static void fun(String str){
        String res;
        int n =str.length();
        Stack s;
        for(int i=n;i>0;i--){
            s.push(i+1);
            char c=str.charAt(i);
            if (i == seq.length() || c == '1') {
                while(s.length()!=0){

                    res += String.valueOf(s.length()-1);
                    res+=" ";
                    s.pop();
                }
            }
        }
        System.out.println(res);
    } 
    public static void main(String args[]){
        String str="11001010";
        fun(str);
    }
}


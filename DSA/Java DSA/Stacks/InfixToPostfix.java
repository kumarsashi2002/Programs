import java.util.Stack;
public class InfixToPostfix {
    public static void main(String[] args) {
        Stack <Character> st=new Stack<>();
        String s1="(A+B-5*C)";
        String ans="";
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            switch(c){
                case '(':
                    st.push(c);
                case '{':
                    st.push(c);
                case '[':
                    st.push(c);

                case '/':
                    if(c=='/' && st.peek()!='^'){
                        st.push(c);
                    }else{
                        while(st.peek()!='^'){
                            int l=st.pop();
                            ans=ans+l;
                        }
                    }
            }


            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else if(c=='/'){
                if(c=='/' && st.peek()!='^'){
                    st.push(c);
                }else{

                }
                
            }

            else{
                ans=ans+c;
            }
        }
    }
}

import java.util.ArrayList;

public class StackUsingArrayList {

    static class Stack{
        static ArrayList <Integer> al=new ArrayList<>();
        static boolean isEmpty(){
            return al.size()==0;
        }

        public static void push(int data){
            al.add(data);
        }
        public static int pop(){
            int top=al.get(al.size()-1);
            al.remove(al.size()-1);
            return top;
        }
        public static int peek(){
            int top=al.get(al.size()-1);
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            int top=s.peek();
            System.out.println(s.peek());
            s.pop();
        }

    }
}


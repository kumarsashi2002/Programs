import java.util.Stack;

public class QueueUsingTwoStacks {

    static void push(int data){
        if(s1.isEmpty){
            s1.push(data);
        }
        while(!s1.isEmpty){
            s2.push(s1.pop());
        }
    }

    static int pop(){
        if(s1.isEmpty){
            return -1;
        }
        int top=s1.pop();
        return top;
    }

    // static int peek(){
    //     if(s1.isEmpty){
    //         return -1;
    //     }
    //     int top=
    // }

    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        push(0);
        push(1);
        push(2);
        push(3);
        while(isEmpty()){
            int val=pop();
            System.out.println(val);
        }
    }
}

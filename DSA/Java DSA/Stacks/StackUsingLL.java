public class StackUsingLL{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class stack{
        public static Node head;

        static boolean isEmpty(){
            return head==null;
        }
        static void push(int data){
            Node n1=new Node(data);
            if(isEmpty()){
                head=n1;
                return;
            }
            n1.next=head;
            head=n1;
        }

        static int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        static int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty.");
                return -1;
            }
            int top=head.data;
            return top;
        }
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while(!st.isEmpty()){
            int top=st.peek();
            System.out.println(top);
            st.pop();
        }
    }
}

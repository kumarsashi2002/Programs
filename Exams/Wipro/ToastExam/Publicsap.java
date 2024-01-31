import java.util.*;
public class Publicsap {
    public static void main(String[] args) {
        int arr[]={3,4,2,6,5};
        stackq(arr);
    }
    public static int [] stackq(int arr[]){
        //int top=-1,rear=-1,front=-1;
        Stack <Integer> st = new Stack<>();
        Queue <Integer> q = new Queue<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()){
                q.push(st.peek());
                st.pop();
            }
            st.push(arr[i]);
            while(!q.isEmpty()){
                st.push(q.front());
                q.pop();
            }
        }

        for(int j=0;j<arr.length;j++){
            arr[j]=st.peek();
            st.pop();
        }
        return arr;
    }
    

	
}
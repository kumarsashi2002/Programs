import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        //PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int arr[]={3,62,18,32,9,62};
        for(int val:arr){
            if(!pq.contains(val)){
                pq.add(val);
            }
        }
        System.out.println(pq);
        
        int x = pq.peek();
        for(int i=0;i<3;i++){
            pq.poll();
        }
        x=pq.peek();
        System.out.println(x);
        System.out.println(pq);
    }
}

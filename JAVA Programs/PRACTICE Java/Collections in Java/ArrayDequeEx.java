import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque <Integer> adq = new ArrayDeque<>();
        adq.push(36);
        adq.push(54);
        adq.push(29);
        adq.push(95);
        System.out.println(adq);
        adq.pop();
        while(adq.peek()!=null){
            System.out.println("Popping using loop: "+adq.pop());
        }
        System.out.println(adq);
    }
}

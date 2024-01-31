import java.util.Stack;

public class StackEx {
    public static void main(String args[]){
        Stack <Integer> s1=new Stack <Integer>();
        // s1.add(20);
        // s1.add(30);
        // s1.add(60);
        // s1.add(90);

        s1.push(20);
        s1.push(10);
        s1.push(15);
        s1.push(30);
        System.out.println("Stack Elements are: "+s1);
        System.out.println("Top(peek) of stack is: "+s1.peek());
        //s1.pop();
        System.out.println("removing element: "+s1.pop());
        System.out.println("Check stack is empty or not: "+s1.empty());
        // // Search *********************************************
        // System.out.println("check "+search(15));
        
    }
}


/*
 * Methods defined in stack class===
 * push(obj), pop(),  peek() empty()  search(obj)
 * 
 * = We can also use methods defined in collection interface ===
a1.add(x);
a1.add(0,"z");;
a1.size();
a1.remove();
a1.remove("z");
a1.get(0);
a1.indexOf("A");
a1.set(2,"xyz");
a1.contains("A");
a1.subList(0,2);
a1.isEmpty();
 */

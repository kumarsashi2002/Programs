public class DetectingLoop {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head,tail;

    public static void insert(int data){
        Node n1 =new Node(data);
        if(head==null){
            head=n1;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n1;
        tail=n1;
    }

    public static boolean isCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println("LL contains a cycle");
                return true;  // Cycle exists
            }
        }
        System.out.println("LL doesn't contains a cycle");
        return false;  // Cycle doesn't exist
    }

    public static void removeCycle(){
        /* checking loop */
        Node slow =head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }

        if(cycle == false){
            return;
        }

        /* Finding last node or next meeting point */
        slow=head;
        Node prev=fast;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;  // making last node's next null
    }

    public static void print(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty");
        }
        while(temp!=null){
            System.out.print(temp.data +"=>");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insert(0);
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        // print();
        
        tail.next=head; //linking tail's next to head to create a cycle/Loop
        boolean flag=isCycle(head);
        removeCycle();
        print();
        // System.out.println(flag);
    }
}
